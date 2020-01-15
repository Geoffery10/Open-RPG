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
    private Boolean add = false;
    private Boolean remove = false;

    public OLInventoryAdapter(Context context, ArrayList<OLItem> items, Boolean add, Boolean remove) {
        this.context = context;
        this.items = items;
        this.add = add;
        this.remove = remove;
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
        OLItem item = items.get(position);

        switch (item.getType()) {
            case "Weapon": holder.imgIcon.setImageResource(R.drawable.ic_weapon_icon);
            case "Armor": holder.imgIcon.setImageResource(R.drawable.ic_armor_icon);
            case "Potion": holder.imgIcon.setImageResource(R.drawable.ic_potion_icon);
            default : holder.imgIcon.setImageResource(R.drawable.ic_other_icon);
        }

        /*if (item.getType().equals("Weapon")) {
            holder.imgIcon.setImageResource(R.drawable.ic_weapon_icon);
        } else if (item.getType().equals("Armor")) {
            holder.imgIcon.setImageResource(R.drawable.ic_armor_icon);
        } else if (item.getType().equals("Potion")) {
            holder.imgIcon.setImageResource(R.drawable.ic_potion_icon);
        } else {
            holder.imgIcon.setImageResource(R.drawable.ic_other_icon);
        }*/

        holder.txtTitle.setText(item.getTitle());
        holder.txtDescription.setText(item.getDescription());
        holder.txtQuantity.setText("Quantity: " + item.getQuantity());
    }

    @Override
    public int getItemCount() {
        int size = items.size();
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