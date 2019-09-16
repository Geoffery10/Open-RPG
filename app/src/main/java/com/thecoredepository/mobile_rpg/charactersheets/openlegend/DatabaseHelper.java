package com.thecoredepository.mobile_rpg.charactersheets.openlegend;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;



public class DatabaseHelper extends SQLiteOpenHelper {

    private static String DB_PATH= "data/data/com.thecoredepository.mobile_rpg/databases/";
    private static String DB_NAME = "olSheets";
    private SQLiteDatabase dbObj;
    private final Context context;

    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, 3);
        this.context = context;
    }

    public void createDB() throws IOException {
        this.getReadableDatabase();
        Log.i("Readable ends.","end");

        try {
            copyDB();
            Log.i("copy db ends.","end");
        } catch (IOException e) {
            throw new Error("Error copying database");
        }
    }



    private boolean checkDB(){
        SQLiteDatabase checkDB = null;
        try{
            String path = DB_PATH + DB_NAME;
            Log.i("myPath ......",path);
            checkDB = SQLiteDatabase.openDatabase(path, null, SQLiteDatabase.OPEN_READONLY);
            Log.i("myPath ......",path);
            if (checkDB!=null)
            {
                Cursor c= checkDB.rawQuery("SELECT * FROM bank", null);
                Log.i("Cursor.......",c.getString(0));
                c.moveToFirst();
                String contents[]=new String[80];
                int flag=0;

                while(! c.isAfterLast())
                {
                    String temp="";
                    String s2=c.getString(0);
                    String s3=c.getString(1);
                    String s4=c.getString(2);
                    temp=temp+"\n Id:"+s2+"\tplayerName:"+s3+"\ttype:"+s4;
                    contents[flag]=temp;
                    flag=flag+1;
                    Log.i("DB values.",temp);
                    c.moveToNext();
                }
            }
            else
            {
                return false;
            }
        }catch(SQLiteException e){
            e.printStackTrace();
        }

        if(checkDB != null){
            checkDB.close();
        }
        return checkDB != null ? true : false;
    }

    public void copyDB() throws IOException{
        try {
            Log.i("inside copyDB.","start");
            InputStream ip =  context.getAssets().open(DB_NAME+".db");
            Log.i("Input Stream.",ip+"");
            String op=  DB_PATH  +  DB_NAME ;
            OutputStream output = new FileOutputStream( op);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = ip.read(buffer))>0){
                output.write(buffer, 0, length);
                Log.i("Content.",length+"");
            }
            output.flush();
            output.close();
            ip.close();
        }
        catch (IOException e) {
            Log.v("error", e.toString());
        }
    }

    public void openDB() throws SQLException {
        String myPath = DB_PATH + DB_NAME;
        dbObj = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READWRITE);
        Log.i("open DB......",dbObj.toString());
    }
    @Override
    public synchronized void close() {
        if(dbObj != null)
            dbObj.close();
        super.close();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}