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

import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend.player;

public class OLFeatAdapter extends RecyclerView.Adapter<OLFeatAdapter.ViewHolder>
{
    private Context context;

    public OLFeatAdapter(Context context)
    {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_feat_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.d("Recycle", "onBindViewHolder called");
        OLFeats feat = new OLFeats();
        feat = player.getFeat(position);

        holder.btnFeat.setText(feat.getTitle()+" - "+feat.getLevel()+"      "+feat.getFeatCost());
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
        TextView lblDescription;
        TextView txtDescription;
        Button txtPrerequisites;
        TextView lblFeatEffect;
        TextView txtFeatEffect;
        LinearLayout specialFeat;
        TextView lblSpecial;
        TextView txtSpecial;
        LinearLayout connectionFeat;
        TextView lblConnection;
        TextView txtConnection;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            viewFeat = itemView.findViewById(R.id.viewFeat);
            btnFeat = itemView.findViewById(R.id.btnFeat);
            infoFeat = itemView.findViewById(R.id.infoFeat);
            lblDescription = itemView.findViewById(R.id.lblDescription);
            txtDescription = itemView.findViewById(R.id.txtDescription);
            txtPrerequisites = itemView.findViewById(R.id.txtPrerequisites);
            lblFeatEffect = itemView.findViewById(R.id.lblFeatEffect);
            txtFeatEffect = itemView.findViewById(R.id.txtFeatEffect);
            specialFeat = itemView.findViewById(R.id.specialFeat);
            lblSpecial = itemView.findViewById(R.id.lblSpecial);
            txtSpecial = itemView.findViewById(R.id.txtSpecial);
            connectionFeat = itemView.findViewById(R.id.connectionFeat);
            lblConnection = itemView.findViewById(R.id.lblConnection);
            txtConnection = itemView.findViewById(R.id.txtConnection);
        }
    }
}
