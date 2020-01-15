package com.thecoredepository.mobile_rpg.charactersheets.openlegend.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
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

        /*LinearLayout viewBaneBoon;
        Button btnBaneBoon; //BANE/BOON - 1/4/7
        LinearLayout infoBaneBoon;
        Button lblDescription;
        TextView txtDescription; //@string/BANEBOON_description
        Button lblDuration;
        TextView txtDuration; //@string/BANEBOON_duration
        Button lblAttributes;
        TextView txtAttributes; //@string/BANEBOON_attributes
        Button lblAttack;
        TextView txtAttack; //@string/BANEBOON_attack
        Button lblPowerLvl;
        Button txtPowerLvl; //BANEBOON.minLvl
        Button lblEffect;
        TextView txtEffect; //@string/BANEBOON_effect
        LinearLayout viewSpecial; //Hide if BANEBOON.special == "N/A"
        Button lblSpecial;
        TextView txtSpecial; //@string/BANEBOON_special*/


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            /*viewBaneBoon = itemView.findViewById(R.id.viewBaneBoon);
            btnBaneBoon = itemView.findViewById(R.id.btnBaneBoon);
            infoBaneBoon = itemView.findViewById(R.id.infoBaneBoon);
            lblDescription = itemView.findViewById(R.id.lblDescription);
            txtDescription = itemView.findViewById(R.id.txtDescription);
            lblDuration = itemView.findViewById(R.id.lblDuration);
            txtDuration = itemView.findViewById(R.id.txtDuration);
            lblAttributes = itemView.findViewById(R.id.lblAttributes);
            txtAttributes = itemView.findViewById(R.id.txtAttributes);
            lblAttack = itemView.findViewById(R.id.lblAttack);
            txtAttack = itemView.findViewById(R.id.txtAttack);
            lblPowerLvl = itemView.findViewById(R.id.lblPowerLvl);
            txtPowerLvl = itemView.findViewById(R.id.txtPowerLvl);
            lblEffect = itemView.findViewById(R.id.lblEffect);
            txtEffect = itemView.findViewById(R.id.txtEffect);
            viewSpecial = itemView.findViewById(R.id.viewSpecial);
            lblSpecial = itemView.findViewById(R.id.lblSpecial);
            txtSpecial = itemView.findViewById(R.id.txtSpecial);*/
        }
    }
}