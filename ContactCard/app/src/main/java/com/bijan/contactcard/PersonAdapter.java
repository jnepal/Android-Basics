package com.bijan.contactcard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Bijan on 6/6/2015.
 */
public class PersonAdapter extends ArrayAdapter<Person> {
    private LayoutInflater inflater;

    public PersonAdapter(Context context, List<Person> objects) {
        super(context, R.layout.person_item, objects);
        // initalize in constructor
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = inflater.inflate(R.layout.person_item, parent,false);
        TextView name = (TextView)view.findViewById(R.id.nameTv);
        TextView address = (TextView)view.findViewById(R.id.addTv);
        TextView phone = (TextView)view.findViewById(R.id.phnTv);

        Person p = getItem(position);//harek person ko record tanna ko lagi
        name.setText(p.getName());
        address.setText(p.getAddress());
        phone.setText(p.getPhone()+"");

        return view;
    }
}
