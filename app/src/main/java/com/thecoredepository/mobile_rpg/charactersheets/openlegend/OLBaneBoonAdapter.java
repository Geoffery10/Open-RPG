package com.thecoredepository.mobile_rpg.charactersheets.openlegend;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.thecoredepository.mobile_rpg.R;

import java.util.ArrayList;

import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend.player;
import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend.sheetList;

public class OLBaneBoonAdapter extends RecyclerView.Adapter<OLFeatAdapter.ViewHolder>
{
    private Context context;
    private Boolean add = false;
    private Boolean remove = false;
    private Boolean showAll = false;

    public ArrayList<OLFeats> getFeatsList() {
        return featsList;
    }

    public OLFeats getFeatsList(int position) {
        return featsList.get(position);
    }

    private ArrayList<OLFeats> featsList = new ArrayList<>();

    public OLFeatAdapter(Context context, ArrayList<OLFeats> feats, Boolean add, Boolean remove, Boolean showAll)
    {
        this.context = context;
        this.featsList = feats;
        this.add = add;
        this.remove = remove;
        this.showAll = showAll;
    }

    @NonNull
    @Override
    public OLFeatAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_feat_item, parent, false);
        OLBaneBoonAdapter.ViewHolder holder = new OLBaneBoonAdapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final OLFeatAdapter.ViewHolder holder, int position) {
        Log.d("Recycle", "onBindViewHolder called");
        OLFeats feat = new OLFeats();

        holder.infoFeat.setVisibility(View.GONE);
        holder.viewAddRemoveUpgradeFeat.setVisibility(View.GONE);
        holder.spinnerAddRemoveUpgradeFeat.setVisibility(View.GONE);
        holder.spinnerAddRemoveUpgradeFeat2.setVisibility(View.GONE);
        holder.editAddRemoveUpgradeFeat.setVisibility(View.GONE);

        if (add == false && showAll == false)
        {
            feat = getFeatsList(position);

            String btnFeatText = feat.getTitle() + "";
            if (feat.getConnection() != null) {
                btnFeatText += " (" + feat.getConnection() + ")";
            }
            if (feat.getMaxLevel() > 1) {
                int levelNum = feat.getLevel();
                btnFeatText += " - " + numberToRoman(levelNum) + "  ";
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
        if (add == true || showAll == true) {
            feat = OLFeats.getFeatList().get(position);
            String btnFeatText = feat.getTitle() + " ";
            if (feat.getMaxLevel() > 1) {
                int levelNum = feat.getMaxLevel();
                btnFeatText += " - I-" + numberToRoman(levelNum);
            }
            else {
                btnFeatText += " - I";
            }

            btnFeatText += "  [" + feat.getFeatCost() + "]";
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
        }
        //=================================ADD NEW FEAT=============================================
        if (add == true)
        {
            //THIS SHOULD BE SET IN A MORE UNIVERSAL LOCATION LATER
            player.setAvaliableBanes();
            player.setAvaliableBoons();

            //IF THERE IS A CONNECTION SHOW FIELDS
            if (!feat.getConnectionType().equals(""))
            {
                //Show Connection Inputs based off ConnectionType labels
                ArrayList<String> connections = new ArrayList<>();

                //CONNECTION SETUPS
                if (feat.getConnectionType().equals("Character"))
                {
                    connections = (ArrayList<String>)sheetList.clone();
                    connections.remove(sheetList.indexOf(player.getCharName()));
                }
                else if (feat.getConnectionType().equals("Weapon/Attack Type"))
                {
                    //getAvailableWeaponAttackTypes is not setup yet
                    //connections = (ArrayList<String>)player.getAvailableWeaponAttackTypes().clone();
                }
                else if (feat.getConnectionType().equals("Attribute"))
                {
                    //ATTRIBUTES HERE
                }
                else if (feat.getConnectionType().equals("AvailableBane"))
                {
                    connections = player.getAvailableBanes();
                }

                ArrayAdapter<String> featSpinner = new ArrayAdapter<String>(context, R.layout.spinner_style, connections);
                holder.spinnerAddRemoveUpgradeFeat.setAdapter(featSpinner);
                holder.spinnerAddRemoveUpgradeFeat.setVisibility(View.VISIBLE);
            }
            else {
                holder.spinnerAddRemoveUpgradeFeat.setVisibility(View.GONE);
            }
            holder.viewAddRemoveUpgradeFeat.setVisibility(View.VISIBLE);
            if (feat.getCanBeTakenMoreThanOnce() == true || !player.getFeats().contains(feat)) {
                holder.btnAddRemove.setText("Add");
                holder.btnAddRemove.setVisibility(View.VISIBLE);
            }
            else {
                holder.btnAddRemove.setVisibility(View.GONE);
            }
            if (player.getFeats().contains(feat) && player.getFeatLevel(feat) < feat.getMaxLevel()) {
                holder.btnUpgrade.setVisibility(View.VISIBLE);
            }
            else {
                holder.btnUpgrade.setVisibility(View.GONE);
            }

            final int finalPosition = position;
            final OLFeats finalFeat = feat;
            holder.btnAddRemove.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Add Feat to Player

                    if (holder.spinnerAddRemoveUpgradeFeat.getVisibility() == View.VISIBLE) {
                        if (holder.spinnerAddRemoveUpgradeFeat2.getVisibility() == View.VISIBLE) {
                            finalFeat.setConnection(holder.spinnerAddRemoveUpgradeFeat.getSelectedItem().toString() + " - " + holder.spinnerAddRemoveUpgradeFeat2.getSelectedItem().toString());
                        }
                        else {
                            finalFeat.setConnection(holder.spinnerAddRemoveUpgradeFeat.getSelectedItem().toString() + "");
                        }
                    }
                    else if (holder.editAddRemoveUpgradeFeat.getVisibility() == View.VISIBLE) {
                        finalFeat.setConnection("" + holder.editAddRemoveUpgradeFeat.getText());
                    }
                    //Add Connection Data to Feat

                    player.addFeat(finalFeat);
                    //notifyItemRemoved(finalPosition);
                    OLFeatsActivitiy updateFeatPoints = new OLFeatsActivitiy();
                    updateFeatPoints.updateFeatsHeader(context);
                }
            });
        }
        else if (remove == true)
        {
            holder.viewAddRemoveUpgradeFeat.setVisibility(View.VISIBLE);
            holder.spinnerAddRemoveUpgradeFeat.setVisibility(View.GONE);
            holder.spinnerAddRemoveUpgradeFeat2.setVisibility(View.GONE);
            holder.editAddRemoveUpgradeFeat.setVisibility(View.GONE);
            holder.btnAddRemove.setText("Remove");
            holder.btnAddRemove.setVisibility(View.VISIBLE);
            holder.btnUpgrade.setVisibility(View.GONE);

            final int finalPosition = position;
            final OLFeats finalFeat = feat;
            holder.btnAddRemove.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Remove Feat from Player then Reload
                    player.removeFeat(finalFeat);
                    notifyItemRemoved(finalPosition);
                    OLFeatsActivitiy updateFeatPoints = new OLFeatsActivitiy();
                    updateFeatPoints.updateFeatsHeader(context);
                }
            });
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

    private String numberToRoman(int levelNum) {
        String result = "";
        while (levelNum >= 10) {
            result += "X";
            levelNum -= 10;
        }
        while (levelNum >= 9) {
            result += "IX";
            levelNum -= 9;
        }
        while (levelNum >= 5) {
            result += "V";
            levelNum -= 5;
        }
        while (levelNum >= 4) {
            result += "IV";
            levelNum -= 4;
        }
        while (levelNum >= 1) {
            result += "I";
            levelNum -= 1;
        }
        return result;
    }

    @Override
    public int getItemCount() {
        int size = 0;
        if (add == false && showAll == false) {
            Log.d("Recycle", "Size: " + player.getFeatCount());
            size = player.getFeatCount();
        }
        else if (add == true || showAll == true) {
            Log.d("Recycle", "Size: " + OLFeats.getFeatList().size());
            size = OLFeats.getFeatList().size();
        }

        return size;
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
        EditText editAddRemoveUpgradeFeat;
        Spinner spinnerAddRemoveUpgradeFeat;
        Spinner spinnerAddRemoveUpgradeFeat2;
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
            editAddRemoveUpgradeFeat = itemView.findViewById(R.id.editAddRemoveUpgradeFeat);
            spinnerAddRemoveUpgradeFeat = itemView.findViewById(R.id.spinnerAddRemoveUpgradeFeat);
            spinnerAddRemoveUpgradeFeat2 = itemView.findViewById(R.id.spinnerAddRemoveUpgradeFeat2);
            btnAddRemove = itemView.findViewById(R.id.btnAddRemove);
            btnUpgrade = itemView.findViewById(R.id.btnUpgrade);
        }
    }
}
