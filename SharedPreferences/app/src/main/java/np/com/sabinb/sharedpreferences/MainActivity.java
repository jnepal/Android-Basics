package np.com.sabinb.sharedpreferences;

import android.app.SharedElementCallback;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    private TextView textView;
    private SharedPreferences sharedPreferences;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);
        sharedPreferences = getApplicationContext().getSharedPreferences("My Preferences", MODE_PRIVATE);
        editText = (EditText)findViewById(R.id.editText);
        textView.setText(sharedPreferences.getString("KEY_1",""));

    }
    public void btnClick(View view){
        String text = editText.getText().toString().trim();
        if(text.length()>0){
            textView.setText(text);
            sharedPreferences.edit().putString("KEY_1", text).apply();
        }

    }



}
