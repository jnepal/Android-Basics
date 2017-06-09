package np.com.sabinb.listview;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class SecondActivity extends ActionBarActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = (TextView)findViewById(R.id.textView);

        Intent intent = getIntent();
        String text = intent.getExtras().getString("KEY_1");
        textView.setText(text);
    }



}
