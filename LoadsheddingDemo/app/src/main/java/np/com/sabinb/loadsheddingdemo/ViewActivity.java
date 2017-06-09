package np.com.sabinb.loadsheddingdemo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class ViewActivity extends ActionBarActivity {
    private ListView listView;
    private List<Loadshedding> loadshedding;
    private LoadsheddingAdapter adapter;
    private DbAdapter dbAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        listView = (ListView)findViewById(R.id.listView);
        loadshedding = new ArrayList<Loadshedding>();
        adapter = new LoadsheddingAdapter(getApplicationContext(),loadshedding);

        dbAdapter = new DbAdapter(getApplicationContext());
        dbAdapter.open();
        loadshedding.addAll(dbAdapter.fetchAll());
        dbAdapter.close();
        adapter.notifyDataSetChanged();


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_view, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
