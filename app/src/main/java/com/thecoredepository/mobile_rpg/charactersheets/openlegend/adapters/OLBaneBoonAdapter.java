package com.thecoredepository.mobile_rpg.charactersheets.openlegend.adapters;

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
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.lists.OLBanes;
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.lists.OLBoons;

import java.util.ArrayList;

import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend.player;
import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend.sheetList;

public class OLBaneBoonAdapter extends RecyclerView.Adapter<OLBaneBoonAdapter.ViewHolder>
{
    private Context context;
    private Boolean showBanes = false;
    private Boolean showBoons = false;

    public ArrayList<OLBanes> getBanesList() {
        return banesList;
    }

    public OLBanes getBanesList(int position) {
        return banesList.get(position);
    }

    public ArrayList<OLBoons> getBaneBoonsList() {
        return boonsList;
    }

    public OLBoons getBoonsList(int position) {
        return boonsList.get(position);
    }

    private ArrayList<OLBanes> banesList = new ArrayList<>();
    private ArrayList<OLBoons> boonsList = new ArrayList<>();

    public OLBaneBoonAdapter(Context context, ArrayList<OLBanes> banes, ArrayList<OLBoons> boons, Boolean showBanes, Boolean showBoons)
    {
        this.context = context;
        this.banesList = banes;
        this.boonsList = boons;
        this.showBanes = showBanes;
        this.showBoons = showBoons;
    }

    @NonNull
    @Override
    public OLBaneBoonAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_baneboon_item, parent, false);
        OLBaneBoonAdapter.ViewHolder holder = new OLBaneBoonAdapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final OLBaneBoonAdapter.ViewHolder holder, int position) {
        Log.d("Recycle", "onBindViewHolder called");
        OLBanes bane = new OLBanes();
        OLBoons boon = new OLBoons();




        /*if (add == false && showAll == false)
        {
            baneBoon = getBaneBoonsList(position);

            String btnBaneBoonText = baneBoon.getTitle() + "";
            if (baneBoon.getConnection() != null) {
                btnBaneBoonText += " (" + baneBoon.getConnection() + ")";
            }
            if (baneBoon.getMaxLevel() > 1) {
                int levelNum = baneBoon.getLevel();
                btnBaneBoonText += " - " + numberToRoman(levelNum) + "  ";
            }

            btnBaneBoonText += "[" + baneBoon.getBaneBoonCost() + "]";
            holder.btnBaneBoon.setText(btnBaneBoonText);
            holder.txtDescription.setText(baneBoon.getDescription());
            if (!baneBoon.getPrerequisites().equals("None")) {
                holder.txtPrerequisites.setText(baneBoon.getPrerequisites());
                holder.lblPrerequisites.setVisibility(View.VISIBLE);
                holder.txtPrerequisites.setVisibility(View.VISIBLE);
            }
            else {
                holder.lblPrerequisites.setVisibility(View.GONE);
                holder.txtPrerequisites.setVisibility(View.GONE);
            }
            holder.txtBaneBoonEffect.setText(baneBoon.getEffects());
            if (!baneBoon.getSpecial().equals("None")) {
                holder.txtSpecial.setText(baneBoon.getSpecial());
                holder.txtSpecial.setVisibility(View.VISIBLE);
            }
            else {
                holder.txtSpecial.setVisibility(View.GONE);
            }

            holder.viewAddRemoveUpgradeBaneBoon.setVisibility(View.GONE);

            holder.btnBaneBoon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Open BaneBoon
                    if (holder.infoBaneBoon.getVisibility() == View.GONE)
                    {
                        holder.infoBaneBoon.setVisibility(View.VISIBLE);
                    }
                    else
                    {
                        holder.infoBaneBoon.setVisibility(View.GONE);
                    }
                }
            });
        }
        if (add == true || showAll == true) {
            baneBoon = OLBanes.getBaneBoonList().get(position);
            String btnBaneBoonText = baneBoon.getTitle() + " ";
            if (baneBoon.getMaxLevel() > 1) {
                int levelNum = baneBoon.getMaxLevel();
                btnBaneBoonText += " - I-" + numberToRoman(levelNum);
            }
            else {
                btnBaneBoonText += " - I";
            }

            btnBaneBoonText += "  [" + baneBoon.getBaneBoonCost() + "]";
            holder.btnBaneBoon.setText(btnBaneBoonText);
            holder.txtDescription.setText(baneBoon.getDescription());
            if (!baneBoon.getPrerequisites().equals("None")) {
                holder.txtPrerequisites.setText(baneBoon.getPrerequisites());
                holder.lblPrerequisites.setVisibility(View.VISIBLE);
                holder.txtPrerequisites.setVisibility(View.VISIBLE);
            }
            else {
                holder.lblPrerequisites.setVisibility(View.GONE);
                holder.txtPrerequisites.setVisibility(View.GONE);
            }
            holder.txtBaneBoonEffect.setText(baneBoon.getEffects());
            if (!baneBoon.getSpecial().equals("None")) {
                holder.txtSpecial.setText(baneBoon.getSpecial());
                holder.txtSpecial.setVisibility(View.VISIBLE);
            }
            else {
                holder.txtSpecial.setVisibility(View.GONE);
            }
            holder.viewAddRemoveUpgradeBaneBoon.setVisibility(View.GONE);
        }
        //=================================ADD NEW FEAT=============================================
        if (add == true)
        {
            //THIS SHOULD BE SET IN A MORE UNIVERSAL LOCATION LATER
            player.setAvaliableBanes();
            player.setAvaliableBoons();

            //IF THERE IS A CONNECTION SHOW FIELDS
            if (!baneBoon.getConnectionType().equals(""))
            {
                //Show Connection Inputs based off ConnectionType labels
                ArrayList<String> connections = new ArrayList<>();

                //CONNECTION SETUPS
                if (baneBoon.getConnectionType().equals("Character"))
                {
                    connections = (ArrayList<String>)sheetList.clone();
                    connections.remove(sheetList.indexOf(player.getCharName()));
                }
                else if (baneBoon.getConnectionType().equals("Weapon/Attack Type"))
                {
                    //getAvailableWeaponAttackTypes is not setup yet
                    //connections = (ArrayList<String>)player.getAvailableWeaponAttackTypes().clone();
                }
                else if (baneBoon.getConnectionType().equals("Attribute"))
                {
                    //ATTRIBUTES HERE
                }
                else if (baneBoon.getConnectionType().equals("AvailableBane"))
                {
                    connections = player.getAvailableBanes();
                }

                ArrayAdapter<String> baneBoonSpinner = new ArrayAdapter<String>(context, R.layout.spinner_style, connections);
                holder.spinnerAddRemoveUpgradeBaneBoon.setAdapter(baneBoonSpinner);
                holder.spinnerAddRemoveUpgradeBaneBoon.setVisibility(View.VISIBLE);
            }
            else {
                holder.spinnerAddRemoveUpgradeBaneBoon.setVisibility(View.GONE);
            }
            holder.viewAddRemoveUpgradeBaneBoon.setVisibility(View.VISIBLE);
            if (baneBoon.getCanBeTakenMoreThanOnce() == true || !player.getBaneBoons().contains(baneBoon)) {
                holder.btnAddRemove.setText("Add");
                holder.btnAddRemove.setVisibility(View.VISIBLE);
            }
            else {
                holder.btnAddRemove.setVisibility(View.GONE);
            }
            if (player.getBaneBoons().contains(baneBoon) && player.getBaneBoonLevel(baneBoon) < baneBoon.getMaxLevel()) {
                holder.btnUpgrade.setVisibility(View.VISIBLE);
            }
            else {
                holder.btnUpgrade.setVisibility(View.GONE);
            }

            final int finalPosition = position;
            final OLBanes finalBaneBoon = baneBoon;
            holder.btnAddRemove.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Add BaneBoon to Player

                    if (holder.spinnerAddRemoveUpgradeBaneBoon.getVisibility() == View.VISIBLE) {
                        if (holder.spinnerAddRemoveUpgradeBaneBoon2.getVisibility() == View.VISIBLE) {
                            finalBaneBoon.setConnection(holder.spinnerAddRemoveUpgradeBaneBoon.getSelectedItem().toString() + " - " + holder.spinnerAddRemoveUpgradeBaneBoon2.getSelectedItem().toString());
                        }
                        else {
                            finalBaneBoon.setConnection(holder.spinnerAddRemoveUpgradeBaneBoon.getSelectedItem().toString() + "");
                        }
                    }
                    else if (holder.editAddRemoveUpgradeBaneBoon.getVisibility() == View.VISIBLE) {
                        finalBaneBoon.setConnection("" + holder.editAddRemoveUpgradeBaneBoon.getText());
                    }
                    //Add Connection Data to BaneBoon

                    player.addBaneBoon(finalBaneBoon);
                    //notifyItemRemoved(finalPosition);
                    OLBanesActivitiy updateBaneBoonPoints = new OLBanesActivitiy();
                    updateBaneBoonPoints.updateBaneBoonsHeader(context);
                }
            });
        }
        else if (remove == true)
        {
            holder.viewAddRemoveUpgradeBaneBoon.setVisibility(View.VISIBLE);
            holder.spinnerAddRemoveUpgradeBaneBoon.setVisibility(View.GONE);
            holder.spinnerAddRemoveUpgradeBaneBoon2.setVisibility(View.GONE);
            holder.editAddRemoveUpgradeBaneBoon.setVisibility(View.GONE);
            holder.btnAddRemove.setText("Remove");
            holder.btnAddRemove.setVisibility(View.VISIBLE);
            holder.btnUpgrade.setVisibility(View.GONE);

            final int finalPosition = position;
            final OLBanes finalBaneBoon = baneBoon;
            holder.btnAddRemove.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Remove BaneBoon from Player then Reload
                    player.removeBaneBoon(finalBaneBoon);
                    notifyItemRemoved(finalPosition);
                    OLBanesActivitiy updateBaneBoonPoints = new OLBanesActivitiy();
                    updateBaneBoonPoints.updateBaneBoonsHeader(context);
                }
            });
        }
        holder.btnBaneBoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Open BaneBoon
                if (holder.infoBaneBoon.getVisibility() == View.GONE)
                {
                    holder.infoBaneBoon.setVisibility(View.VISIBLE);
                }
                else
                {
                    holder.infoBaneBoon.setVisibility(View.GONE);
                }
            }
        });
        */

    }

    @Override
    public int getItemCount() {
        int size = 0;
        //Get count of banes, boons, or both

        /*
        if (showAll == false) {
            Log.d("Recycle", "Size: " + player.getBaneBoonCount());
            size = player.getBaneBoonCount();
        }
        else if (add == true || showAll == true) {
            Log.d("Recycle", "Size: " + OLBanes.getBaneBoonList().size());
            size = OLBanes.getBaneBoonList().size();
        }
        */

        return size;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        /*
        LinearLayout viewBaneBoon;
        Button btnBaneBoon;
        LinearLayout infoBaneBoon;
        Button lblDescription;
        TextView txtDescription;
        Button lblPrerequisites;
        TextView txtPrerequisites;
        Button lblBaneBoonEffect;
        TextView txtBaneBoonEffect;
        LinearLayout specialBaneBoon;
        Button lblSpecial;
        TextView txtSpecial;
        LinearLayout viewAddRemoveUpgradeBaneBoon;
        EditText editAddRemoveUpgradeBaneBoon;
        Spinner spinnerAddRemoveUpgradeBaneBoon;
        Spinner spinnerAddRemoveUpgradeBaneBoon2;
        Button btnAddRemove;
        Button btnUpgrade;

         */

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            /*
            viewBaneBoon = itemView.findViewById(R.id.viewBaneBoon);
            btnBaneBoon = itemView.findViewById(R.id.btnBaneBoon);
            infoBaneBoon = itemView.findViewById(R.id.infoBaneBoon);
            lblDescription = itemView.findViewById(R.id.lblDescription);
            txtDescription = itemView.findViewById(R.id.txtDescription);
            lblPrerequisites = itemView.findViewById(R.id.lblPrerequisites);
            txtPrerequisites = itemView.findViewById(R.id.txtPrerequisites);
            lblBaneBoonEffect = itemView.findViewById(R.id.lblBaneBoonEffect);
            txtBaneBoonEffect = itemView.findViewById(R.id.txtBaneBoonEffect);
            specialBaneBoon = itemView.findViewById(R.id.specialBaneBoon);
            lblSpecial = itemView.findViewById(R.id.lblSpecial);
            txtSpecial = itemView.findViewById(R.id.txtSpecial);
            viewAddRemoveUpgradeBaneBoon = itemView.findViewById(R.id.viewAddRemoveUpgradeBaneBoon);
            editAddRemoveUpgradeBaneBoon = itemView.findViewById(R.id.editAddRemoveUpgradeBaneBoon);
            spinnerAddRemoveUpgradeBaneBoon = itemView.findViewById(R.id.spinnerAddRemoveUpgradeBaneBoon);
            spinnerAddRemoveUpgradeBaneBoon2 = itemView.findViewById(R.id.spinnerAddRemoveUpgradeBaneBoon2);
            btnAddRemove = itemView.findViewById(R.id.btnAddRemove);
            btnUpgrade = itemView.findViewById(R.id.btnUpgrade);

             */
        }

    }
}
