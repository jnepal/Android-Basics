package np.com.sabinb.loadsheddingdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Sabin on 6/8/2015.
 */
public class LoadsheddingAdapter extends ArrayAdapter<Loadshedding> {
    private LayoutInflater inflater;
    private TextView dayTv;
    private TextView morningTv;
    private TextView eveningTv;

    public LoadsheddingAdapter(Context context, List<Loadshedding> objects) {
        super(context, R.layout.loadshedding_item, objects);
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = inflater.inflate(R.layout.loadshedding_item, parent, false);
        dayTv = (TextView)view.findViewById(R.id.dayTv);
        morningTv = (TextView)view.findViewById(R.id.morningTv);
        eveningTv = (TextView)view.findViewById(R.id.eveningTv);

        Loadshedding loadshedding = getItem(position);
        dayTv.setText(loadshedding.getGroup());
        morningTv.setText(loadshedding.getMorningTime());
        eveningTv.setText(loadshedding.getEveningTime());

        return view;
    }
}
