package np.com.sabinb.newsportaldemo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends ActionBarActivity implements AdapterView.OnItemClickListener {
    private ListView listView;
    private String newsPortal[];
    private ArrayAdapter<String>adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newsPortal = new String[]{"ekantipur", "setopati", "myrepublica", "onlinekhabar"};
        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, android.R.id.text1, newsPortal);
        listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String url = (String) parent.getItemAtPosition(position);
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        intent.putExtra("URL", url);
        startActivity(intent);
    }
}
