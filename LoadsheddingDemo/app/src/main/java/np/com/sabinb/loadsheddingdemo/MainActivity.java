package np.com.sabinb.loadsheddingdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.lang.reflect.Array;


public class MainActivity extends ActionBarActivity {
    private DbAdapter dbAdapter;
    private EditText eveningEt;
    private EditText morningEt;
    private Spinner daysSpinner;
    private Spinner groupSpinner;
    private ArrayAdapter groupAdapter;
    private ArrayAdapter daysAdapter;
    public int group;
    public String day;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eveningEt = (EditText)findViewById(R.id.eveningEt);
        morningEt = (EditText)findViewById(R.id.morningEt);
        daysSpinner = (Spinner)findViewById(R.id.daysSpinner);
        groupSpinner = (Spinner)findViewById(R.id.groupSpinner);


        groupAdapter = ArrayAdapter.createFromResource(getApplicationContext(),R.array.group, android.R.layout.simple_spinner_item);
        groupSpinner.setAdapter(groupAdapter);

        daysAdapter = ArrayAdapter.createFromResource(getApplicationContext(),R.array.days, android.R.layout.simple_spinner_item);
        daysSpinner.setAdapter(daysAdapter);

        dbAdapter = new DbAdapter(getApplicationContext());

        groupSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                group = Integer.parseInt((String)parent.getItemAtPosition(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        daysSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                day = (String)parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void btnClick(View view){

        switch(view.getId()){
            case R.id.saveBtn:
                String eveningTime, morningTime;
                eveningTime = eveningEt.getText().toString().trim();
                morningTime = morningEt.getText().toString().trim();
                dbAdapter.open();
                dbAdapter.insert(group,day,morningTime,eveningTime);
                dbAdapter.close();


                break;
            case R.id.viewBtn:
                Intent intent = new Intent(getApplicationContext(), ViewActivity.class);
                startActivity(intent);
                break;
        }

    }

}
