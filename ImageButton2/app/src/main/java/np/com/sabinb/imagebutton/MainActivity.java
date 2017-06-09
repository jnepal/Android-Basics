package np.com.sabinb.imagebutton;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


class MainActivity extends ActionBarActivity implements View.OnClickListener{
    private ImageButton imgBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgBtn = (ImageButton)findViewById(R.id.imageButton);
        imgBtn.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.imageButton:
            Toast.makeText(getApplicationContext(), "HELLO I am Toast From Image Button", Toast.LENGTH_LONG).show();

        }
    }
}
