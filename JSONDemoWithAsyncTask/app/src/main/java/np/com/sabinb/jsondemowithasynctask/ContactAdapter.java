package np.com.sabinb.jsondemowithasynctask;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Sabin on 6/11/2015.
 */
public class ContactAdapter extends ArrayAdapter<Contact> {
    private LayoutInflater inflater;
    public ContactAdapter(Context context, List<Contact> objects) {
        super(context, R.layout.adapter_contact, objects);

        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = inflater.inflate(R.layout.adapter_contact, parent, false);
        TextView nameTv = (TextView) view.findViewById(R.id.nameTv);
        TextView emailTv = (TextView) view.findViewById(R.id.emailTv);
        TextView phoneTv = (TextView) view.findViewById(R.id.phoneTv);

        Contact contact = getItem(position);
        nameTv.setText(contact.getName());
        emailTv.setText(contact.getEmail());
        phoneTv.setText(contact.getEmail());

        return view;
    }
}


