package com.thecoredepository.mobile_rpg.charactersheets.openlegend.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.thecoredepository.mobile_rpg.R;
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.lists.OLItem;

import java.util.ArrayList;

public class OLInventoryAdapter extends RecyclerView.Adapter<OLInventoryAdapter.ViewHolder> {
    private Context context;

    private ArrayList<OLItem> items = new ArrayList<>();

    public OLInventoryAdapter(Context context, ArrayList<OLItem> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_item, parent, false);
        OLInventoryAdapter.ViewHolder holder = new OLInventoryAdapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final OLInventoryAdapter.ViewHolder holder, int position) {
        Log.d("Recycle", "onBindViewHolder called");
        OLItem item = new OLItem();

    }

    @Override
    public int getItemCount() {
        int size = 0;
        //Get count

        Log.d("Recycle", "Size: " + size);

        return size;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ConstraintLayout viewItem;
        ImageView imgIcon;
        TextView txtTitle;
        TextView txtDescription;
        TextView txtQuantity;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            viewItem = itemView.findViewById(R.id.viewItem);
            imgIcon = itemView.findViewById(R.id.imgIcon);
            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtDescription = itemView.findViewById(R.id.txtDescription);
            txtQuantity = itemView.findViewById(R.id.txtQuanity);
        }
    }
}