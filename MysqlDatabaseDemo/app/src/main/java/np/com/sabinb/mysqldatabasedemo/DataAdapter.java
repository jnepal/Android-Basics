package np.com.sabinb.mysqldatabasedemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Sabin on 6/12/2015.
 */
public class DataAdapter extends ArrayAdapter<Data> {
    private LayoutInflater inflater;
    public DataAdapter(Context context, List<Data> objects) {
        super(context, R.layout.adapter_data, objects);

        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = inflater.inflate(R.layout.adapter_data, parent, false);
        TextView nameTv = (TextView)view.findViewById(R.id.nameTv);
        TextView titleTv = (TextView)view.findViewById(R.id.titleTv);
        TextView durationTv = (TextView)view.findViewById(R.id.durationTv);

        Data data = getItem(position);
        nameTv.setText(data.getName());
        titleTv.setText(data.getTitle());
        durationTv.setText(data.getDuration());
        return view;
    }
}
