package np.com.sabinb.jsondemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Sabin on 6/9/2015.
 */
public class SpeakerAdapter extends ArrayAdapter<Speaker> {
    private LayoutInflater inflater;
    public SpeakerAdapter(Context context, List<Speaker> objects) {
        super(context, R.layout.adapter_speaker, objects);

        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = inflater.inflate(R.layout.adapter_speaker, parent, false );
        TextView nameTv = (TextView)view.findViewById(R.id.nameTv);
        TextView titleTv = (TextView)view.findViewById(R.id.titleTv);

        Speaker speaker = getItem(position);
        nameTv.setText(speaker.getName());
        titleTv.setText(speaker.getTitle());


        return view;
    }
}
