package np.com.sabinb.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Sabin on 4/22/2015.
 */
public class EmployeeAdapter extends ArrayAdapter<Employee> {
    private LayoutInflater inflater;
    public EmployeeAdapter(Context context, List<Employee> objects) {
        super(context, R.layout.adapter_employee, objects);
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = inflater.inflate(R.layout.adapter_employee, parent, false);
        Employee e = getItem(position);
        TextView nameTextView = (TextView)view.findViewById(R.id.nameText);
        TextView addressTextView = (TextView)view.findViewById(R.id.addressText);
        TextView ageTextView = (TextView)view.findViewById(R.id.ageText);

        nameTextView.setText(e.getName());
        addressTextView.setText(e.getAddress());
        ageTextView.setText(e.getAge()+"");
        return view ;
    }
}
