package com.thecoredepository.mobile_rpg.charactersheets.openlegend;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.thecoredepository.mobile_rpg.R;

import java.util.ArrayList;

import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend.player;

public class OLFeatAdapter extends RecyclerView.Adapter<OLFeatAdapter.ViewHolder>
{
    private Context context;
    private Boolean add;
    private Boolean remove;

    public ArrayList<OLFeats> getFeatsList() {
        return featsList;
    }

    public OLFeats getFeatsList(int position) {
        return featsList.get(position);
    }

    private ArrayList<OLFeats> featsList = new ArrayList<>();

    public OLFeatAdapter(Context context, ArrayList<OLFeats> feats, Boolean add, Boolean remove)
    {
        this.context = context;
        this.featsList = feats;
        this.add = add;
        this.remove = remove;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_feat_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        Log.d("Recycle", "onBindViewHolder called");
        OLFeats feat = new OLFeats();

        if (add == false && remove == false)
        {
            feat = getFeatsList(position);

            String btnFeatText = feat.getTitle() + " ";
            if (feat.getConnection() != null) {
                btnFeatText += "(" + feat.getConnection() + ") - ";
            }
            if (feat.getMaxLevel() > 1) {
                btnFeatText += "1-" + feat.getMaxLevel() + "  ";
            }

            btnFeatText += "[" + feat.getFeatCost() + "]";
            holder.btnFeat.setText(btnFeatText);
            holder.txtDescription.setText(feat.getDescription());
            if (!feat.getPrerequisites().equals("None")) {
                holder.txtPrerequisites.setText(feat.getPrerequisites());
                holder.lblPrerequisites.setVisibility(View.VISIBLE);
                holder.txtPrerequisites.setVisibility(View.VISIBLE);
            }
            else {
                holder.lblPrerequisites.setVisibility(View.GONE);
                holder.txtPrerequisites.setVisibility(View.GONE);
            }
            holder.txtFeatEffect.setText(feat.getEffects());
            if (!feat.getSpecial().equals("None")) {
                holder.txtSpecial.setText(feat.getSpecial());
                holder.txtSpecial.setVisibility(View.VISIBLE);
            }
            else {
                holder.txtSpecial.setVisibility(View.GONE);
            }

            holder.viewAddRemoveUpgradeFeat.setVisibility(View.GONE);

            holder.btnFeat.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Open Feat
                    if (holder.infoFeat.getVisibility() == View.GONE)
                    {
                        holder.infoFeat.setVisibility(View.VISIBLE);
                    }
                    else
                    {
                        holder.infoFeat.setVisibility(View.GONE);
                    }
                }
            });
        }
        else if (add == true)
        {
            feat = getFeatsList(position);

            String btnFeatText = feat.getTitle() + " ";
            if (feat.getConnection() != null) {
                btnFeatText += "(" + feat.getConnection() + ") - ";
            }
            if (feat.getMaxLevel() > 1) {
                btnFeatText += "1-" + feat.getMaxLevel() + "  ";
            }

            btnFeatText += "[" + feat.getFeatCost() + "]";
            holder.btnFeat.setText(btnFeatText);
            holder.txtDescription.setText(feat.getDescription());
            if (!feat.getPrerequisites().equals("None")) {
                holder.txtPrerequisites.setText(feat.getPrerequisites());
                holder.lblPrerequisites.setVisibility(View.VISIBLE);
                holder.txtPrerequisites.setVisibility(View.VISIBLE);
            }
            else {
                holder.lblPrerequisites.setVisibility(View.GONE);
                holder.txtPrerequisites.setVisibility(View.GONE);
            }
            holder.txtFeatEffect.setText(feat.getEffects());
            if (!feat.getSpecial().equals("None")) {
                holder.txtSpecial.setText(feat.getSpecial());
                holder.txtSpecial.setVisibility(View.VISIBLE);
            }
            else {
                holder.txtSpecial.setVisibility(View.GONE);
            }

            holder.viewAddRemoveUpgradeFeat.setVisibility(View.VISIBLE);
            if (feat.getCanBeTakenMoreThanOnce() == true || !player.getFeats().contains(feat)) {
                holder.btnAddRemove.setText("Add");
                holder.btnAddRemove.setVisibility(View.VISIBLE);
            }
            else {
                holder.btnAddRemove.setVisibility(View.GONE);
            }
            if (player.getFeats().contains(feat)) {
                //Does not check if max feat level has been reached yet
                holder.btnUpgrade.setVisibility(View.VISIBLE);
            }
            else {
                holder.btnUpgrade.setVisibility(View.GONE);
            }

            holder.btnFeat.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Open Feat
                    if (holder.infoFeat.getVisibility() == View.GONE)
                    {
                        holder.infoFeat.setVisibility(View.VISIBLE);
                    }
                    else
                    {
                        holder.infoFeat.setVisibility(View.GONE);
                    }
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        Log.d("Recycle", "Size: " + player.getFeatCount());
        return player.getFeatCount();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        LinearLayout viewFeat;
        Button btnFeat;
        LinearLayout infoFeat;
        Button lblDescription;
        TextView txtDescription;
        Button lblPrerequisites;
        TextView txtPrerequisites;
        Button lblFeatEffect;
        TextView txtFeatEffect;
        LinearLayout specialFeat;
        Button lblSpecial;
        TextView txtSpecial;
        LinearLayout viewAddRemoveUpgradeFeat;
        Button btnAddRemove;
        Button btnUpgrade;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            viewFeat = itemView.findViewById(R.id.viewFeat);
            btnFeat = itemView.findViewById(R.id.btnFeat);
            infoFeat = itemView.findViewById(R.id.infoFeat);
            lblDescription = itemView.findViewById(R.id.lblDescription);
            txtDescription = itemView.findViewById(R.id.txtDescription);
            lblPrerequisites = itemView.findViewById(R.id.lblPrerequisites);
            txtPrerequisites = itemView.findViewById(R.id.txtPrerequisites);
            lblFeatEffect = itemView.findViewById(R.id.lblFeatEffect);
            txtFeatEffect = itemView.findViewById(R.id.txtFeatEffect);
            specialFeat = itemView.findViewById(R.id.specialFeat);
            lblSpecial = itemView.findViewById(R.id.lblSpecial);
            txtSpecial = itemView.findViewById(R.id.txtSpecial);
            viewAddRemoveUpgradeFeat = itemView.findViewById(R.id.viewAddRemoveUpgradeFeat);
            btnAddRemove = itemView.findViewById(R.id.btnAddRemove);
            btnUpgrade = itemView.findViewById(R.id.btnUpgrade);
        }
    }
}
