package com.thecoredepository.mobile_rpg.backend.files;

/* This class is designed for the exporting of character sheets into a usable form for users.
// The entire OpenLegend class should be exported in a human understandable form. This export
// should also be able to be imported back into the app.
*/

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import android.widget.Toast;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.thecoredepository.mobile_rpg.backend.OpenLegend;
import com.thecoredepository.mobile_rpg.ui.AppContext;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import static android.Manifest.permission.READ_EXTERNAL_STORAGE;
import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;
import static android.content.Context.MODE_PRIVATE;

public class ExportSheets
{
    public static final int REQUEST_WRITE_STORAGE = 112;
    private static final int PERMISSION_REQUEST_CODE = 100;
    public static Context mContext;

    public static void exportSheet(OpenLegend sheet) {
        mContext = AppContext.mContext;
        String FILE_NAME = sheet.getCharName()+".txt";
        String PATH = ("/sdcard/Open RPG/" + FILE_NAME);

        String state = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(state)) {
            if (Build.VERSION.SDK_INT >= 23) {
                if (checkPermission()) {
                    File sdcard = Environment.getExternalStorageDirectory();
                    File dir = new File(sdcard.getAbsolutePath() + "/Open-RPG/");
                    PATH = sdcard.getAbsolutePath() + "/Open-RPG/" + FILE_NAME;
                    Log.d("Export Sheet", "Saved to: " + PATH);
                    Toast.makeText(mContext, "Saved to: " + PATH, Toast.LENGTH_LONG).show();
                    dir.mkdir();
                    File file = new File(dir, FILE_NAME);
                    FileOutputStream os = null;
                    try {
                        os = new FileOutputStream(file);
                        os.write(sheet.toString().getBytes());
                        os.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    requestPermission(); // Code for permission
                }
            } else {
                File sdcard = Environment.getExternalStorageDirectory();
                File dir = new File(sdcard.getAbsolutePath() + "/Open-RPG/");
                PATH = sdcard.getAbsolutePath() + "/Open-RPG/" + FILE_NAME;
                Log.d("Export Sheet", "Saved to: " + PATH);
                Toast.makeText(mContext, "Saved to: " + PATH, Toast.LENGTH_LONG).show();
                dir.mkdir();
                File file = new File(dir, FILE_NAME);
                FileOutputStream os = null;
                try {
                    os = new FileOutputStream(file);
                    os.write(sheet.toString().getBytes());
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static boolean checkPermission() {
        int result = ContextCompat.checkSelfPermission(mContext, android.Manifest.permission.WRITE_EXTERNAL_STORAGE);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    private static void requestPermission() {
        if (ActivityCompat.shouldShowRequestPermissionRationale((Activity) mContext, android.Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
            Toast.makeText(mContext, "Write External Storage permission allows us to create files. Please allow this permission in App Settings.", Toast.LENGTH_LONG).show();
        } else {
            ActivityCompat.requestPermissions((Activity) mContext, new String[]{android.Manifest.permission.WRITE_EXTERNAL_STORAGE}, PERMISSION_REQUEST_CODE);
        }
    }

    public static void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        switch (requestCode) {
            case PERMISSION_REQUEST_CODE:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Log.e("value", "Permission Granted, Now you can use local drive .");
            } else {
                Log.e("value", "Permission Denied, You cannot use local drive .");
            }
            break;
        }
    }
}
