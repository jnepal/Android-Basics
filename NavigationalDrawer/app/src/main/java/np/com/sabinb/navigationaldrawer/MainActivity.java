package np.com.sabinb.navigationaldrawer;


import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;


public class MainActivity extends ActionBarActivity {
    private DrawerLayout drawerLayout;
    private ListView listView;
    private String[] navItems;
    private ArrayAdapter<String>adapter;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private ActionBarDrawerToggle drawerToggle;
    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.mipmap.ic_launcher);


        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        listView = (ListView) findViewById(R.id.navDrawer);
        navItems = new String[]{"Home", "About"};
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, navItems);

        listView.setAdapter(adapter);

        fragmentManager = getSupportFragmentManager();
        selectItem(0);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                drawerLayout.closeDrawers();
                selectItem(position);
            }
        });

        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.app_name, R.string.hello_world){
            @Override
            public void onDrawerOpened(View drawerView) {

                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };
        drawerLayout.setDrawerListener(drawerToggle);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(drawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void selectItem(int position){
        fragmentTransaction = fragmentManager.beginTransaction();
        switch (position){
            case 0:
                fragmentTransaction.replace(R.id.frameLayout, new HomeFragment());
                actionBar.setTitle("Home");
                break;
            case 1:
                fragmentTransaction.replace(R.id.frameLayout, new AboutFragment());
                actionBar.setTitle("About");
                break;
        }
        fragmentTransaction.commit();
    }
}
