package np.com.sabinb.buttonandtoast;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{
    private TextView textView;
    private Button btn;
    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView);
        btn = (Button)findViewById(R.id.button);
        btn2 = (Button)findViewById(R.id.button2);
        btn2.setOnClickListener(this);
        btn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button:
                Toast.makeText(getApplicationContext(), "Hello I am Toast", Toast.LENGTH_LONG).show();
                textView.setText("TRING TRING I am Text button one");
                Log.i("MainActivity", "This is Log");
                break;
            case R.id.button2:
                Toast.makeText(getApplicationContext(), "Hello I am Toast from Two", Toast.LENGTH_LONG).show();
                textView.setText("TRING TRING I am Text Button two");
                Log.i("MainActivity", "This is log from two");
                break;
        }



    }
}
