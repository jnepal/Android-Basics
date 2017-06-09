package np.com.sabinb.listview;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements AdapterView.OnItemClickListener {
    private ListView listView;
    private String greetings[];
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greetings = new String []{"hello" , "Namaste", "Salam Walikam"};

        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, android.R.id.text1, greetings);
        listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //Toast.makeText(getApplicationContext(), greetings[position], Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(),(String)parent.getItemAtPosition(position), Toast.LENGTH_LONG).show();
        String text = (String)parent.getItemAtPosition(position);
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        intent.putExtra("KEY_1",text);
        startActivity(intent);
    }
}
