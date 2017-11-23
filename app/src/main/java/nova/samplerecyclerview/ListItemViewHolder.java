package nova.samplerecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Administrator on 2017-11-23.
 */

public class ListItemViewHolder extends RecyclerView.ViewHolder{

    TextView date, cal, sugar, salt;

    public ListItemViewHolder(View itemView) {
        super(itemView);

        date = (TextView) itemView.findViewById(R.id.date);
        cal = (TextView) itemView.findViewById(R.id.listCal);
        sugar = (TextView) itemView.findViewById(R.id.listSugar);
        salt = (TextView) itemView.findViewById(R.id.listSalt);
    }
}