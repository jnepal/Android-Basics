package np.com.sabinb.custommaplistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

/**
 * Created by Sabin on 6/1/2015.
 */
public class EmployeeAdapter extends ArrayAdapter<Map<String, Object>> {
    private LayoutInflater inflater;

    public EmployeeAdapter(Context context, List<Map<String, Object>> objects) {
        super(context, R.layout.adapter_employee, objects);
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = inflater.inflate(R.layout.adapter_employee, parent, false);
        TextView name = (TextView)view.findViewById(R.id.textView);
        TextView address = (TextView)view.findViewById(R.id.textView2);
        TextView age = (TextView)view.findViewById(R.id.textView);

        Map<String, Object> emp = getItem(position);
        name.setText((String)emp.get("Name"));
        address.setText((String)emp.get("Address"));
        //age.setText(((int)emp.get("age"))+"");
        return view;
    }
}
