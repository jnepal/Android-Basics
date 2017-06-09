package np.com.sabinb.spinnerdemonext;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class MainActivity extends ActionBarActivity {
    private String greetings[];
    private Spinner spinner;
    private ArrayAdapter<String> adapter;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner)findViewById(R.id.spinner);

        greetings = new String[]{"Hello", "Namaste", "Salam Walikam"};
        adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_spinner_item,
                android.R.id.text1,
                greetings
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
    }



}
