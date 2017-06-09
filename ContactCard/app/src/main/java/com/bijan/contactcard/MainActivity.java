package com.bijan.contactcard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{
    public Button btnSave;
    private DbAdapter dbAdp;
    public EditText nameEt;
    public EditText addressEt;
    public EditText phoneEt;

    public DbAdapter dbAdp2;
    public ListView lvw;
    public List<Person> persons;
    public PersonAdapter pAdp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvw = (ListView)findViewById(R.id.listView);
        persons = new ArrayList<Person>();
        pAdp = new PersonAdapter(getApplicationContext(), persons);
        // set blank data
        lvw.setAdapter(pAdp);

        dbAdp2 = new DbAdapter(getApplicationContext());
        dbAdp2.open();
        persons.addAll(dbAdp2.getAllPerson());
        dbAdp2.close();
        pAdp.notifyDataSetChanged();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id){
            case R.id.addContact :
                addContact();
                return true;
            
            case R.id.action_settings :
                return true;

            default:
                return super.onOptionsItemSelected(item);  
        }

        
    }
    // adding contact
    private void addContact() {
        setContentView(R.layout.addcontact);

        btnSave = (Button)findViewById(R.id.button);
        btnSave.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        nameEt =(EditText)findViewById(R.id.nameEt);
        addressEt = (EditText)findViewById(R.id.addressEt);
        phoneEt = (EditText)findViewById(R.id.phnoEt);

        String name = nameEt.getText().toString();
        String add = addressEt.getText().toString();
        long phn = Long.parseLong(phoneEt.getText().toString());

        dbAdp = new DbAdapter(getApplicationContext());
        dbAdp.open();
        dbAdp.insertPerson(name,add,phn);
        dbAdp.close();

        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
}
