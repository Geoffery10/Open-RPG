package com.thecoredepository.mobile_rpg.charactersheets.openlegend.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.thecoredepository.mobile_rpg.R;
import com.thecoredepository.mobile_rpg.Theming;
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.OLSavingSheets;
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.lists.OLItem;

import java.util.ArrayList;

import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend.player;

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
    public void onBindViewHolder(@NonNull final OLInventoryAdapter.ViewHolder holder, final int position) {
        Log.d("Recycle", "onBindViewHolder called");
        final OLItem item = items.get(position);
        holder.btnSave.setVisibility(View.GONE);
        holder.btnDelete.setVisibility(View.GONE);
        holder.txtTitle.setVisibility(View.VISIBLE);
        holder.editTitle.setVisibility(View.GONE);
        holder.txtDescription.setVisibility(View.VISIBLE);
        holder.editDescription.setVisibility(View.GONE);
        holder.txtQuantity.setVisibility(View.VISIBLE);
        holder.editQuantity.setVisibility(View.GONE);

        holder.txtTitle.setTextColor(Theming.getFontColor());
        holder.editTitle.setTextColor(Theming.getFontColor());
        holder.txtDescription.setTextColor(Theming.getFontColor());
        holder.editDescription.setTextColor(Theming.getFontColor());
        holder.txtQuantity.setTextColor(Theming.getFontColor());
        holder.editQuantity.setTextColor(Theming.getFontColor());

        setTypeImage(holder, item);

        holder.txtTitle.setText(item.getTitle());
        holder.txtDescription.setText(item.getDescription());
        holder.txtQuantity.setText("Quantity: " + item.getQuantity());

        holder.btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Open Edit
                if (holder.btnSave.getVisibility() == View.GONE)
                {
                    editItem(holder);
                }
                else
                {
                    saveItem(holder, position, item);
                }
            }
        });

        holder.btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveItem(holder, position, item);
            }
        });

        holder.btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.removeItem(item);
                notifyItemRemoved(position);

                //Save
                Log.i("Saving", "Started Saving...");
                OLSavingSheets saveData = new OLSavingSheets();
                saveData.saveData(context);
                Log.i("Saving", "Saved");
            }
        });
    }

    private void editItem(@NonNull ViewHolder holder) {
        holder.btnSave.setVisibility(View.VISIBLE);
        holder.btnDelete.setVisibility(View.VISIBLE);
        holder.txtTitle.setVisibility(View.GONE);
        holder.editTitle.setVisibility(View.VISIBLE);
        holder.txtDescription.setVisibility(View.GONE);
        holder.editDescription.setVisibility(View.VISIBLE);
        holder.txtQuantity.setVisibility(View.GONE);
        holder.editQuantity.setVisibility(View.VISIBLE);

        String quantity = ("" + holder.txtQuantity.getText()).substring(10);
        holder.editTitle.setText(holder.txtTitle.getText());
        holder.editDescription.setText(holder.txtDescription.getText());
        holder.editQuantity.setText(quantity);
    }

    private void saveItem(@NonNull ViewHolder holder, int position, OLItem item) {
        holder.btnSave.setVisibility(View.GONE);
        holder.btnDelete.setVisibility(View.GONE);
        holder.txtTitle.setVisibility(View.VISIBLE);
        holder.editTitle.setVisibility(View.GONE);
        holder.txtDescription.setVisibility(View.VISIBLE);
        holder.editDescription.setVisibility(View.GONE);
        holder.txtQuantity.setVisibility(View.VISIBLE);
        holder.editQuantity.setVisibility(View.GONE);

        String title = "" + holder.editTitle.getText();
        String description = "" + holder.editDescription.getText();

        int quantity;
        if (holder.editQuantity.getText().toString().equals("")) {
            quantity = 1;
        } else {
            quantity = Integer.parseInt("" + holder.editQuantity.getText());
        }

        String type = player.getItemAt(position).getType();

        player.setItemAt(position, new OLItem(title, description, quantity, type));

        holder.txtTitle.setText(player.getItemAt(position).getTitle());
        holder.txtDescription.setText(player.getItemAt(position).getDescription());
        holder.txtQuantity.setText("Quantity: " + player.getItemAt(position).getQuantity());
        setTypeImage(holder, item);

        //Save
        Log.i("Saving", "Started Saving...");
        OLSavingSheets saveData = new OLSavingSheets();
        saveData.saveData(context);
        Log.i("Saving", "Saved");
    }

    private void setTypeImage(@NonNull ViewHolder holder, OLItem item) {
        String type = item.getType();
        switch (type) {
            case "Weapon": holder.imgIcon.setImageResource(R.drawable.ic_weapon_icon);
                break;
            case "Armor": holder.imgIcon.setImageResource(R.drawable.ic_armor_icon);
                break;
            case "Potion": holder.imgIcon.setImageResource(R.drawable.ic_potion_icon);
                break;
            default : holder.imgIcon.setImageResource(R.drawable.ic_other_icon);
        }
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
        ImageView btnEdit;
        Button btnSave;
        Button btnDelete;
        EditText editTitle;
        EditText editDescription;
        EditText editQuantity;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            viewItem = itemView.findViewById(R.id.viewItem);
            imgIcon = itemView.findViewById(R.id.imgIcon);
            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtDescription = itemView.findViewById(R.id.txtDescription);
            txtQuantity = itemView.findViewById(R.id.txtQuanity);
            btnEdit = itemView.findViewById(R.id.btnEdit);
            btnSave = itemView.findViewById(R.id.btnSave);
            btnDelete = itemView.findViewById(R.id.btnDelete);
            editTitle = itemView.findViewById(R.id.editTitle);
            editDescription = itemView.findViewById(R.id.editDescription);
            editQuantity = itemView.findViewById(R.id.editQuantity);

        }
    }
}