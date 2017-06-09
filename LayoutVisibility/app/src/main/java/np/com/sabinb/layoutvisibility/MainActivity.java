package np.com.sabinb.layoutvisibility;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick(View view){
      /*  String text = ((Button)view).getText().toString();
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();*/
        int id = view.getId();
        if(id == R.id.button_ll_1){
            Button btn2 = (Button)findViewById(R.id.button_ll_2);
            btn2.setVisibility(View.INVISIBLE);
        }
        if(id == R.id.button_rl_1){
            Button btn2 = (Button)findViewById(R.id.button_rl_2);
            btn2.setVisibility(view.GONE);
        }
        if(id == R.id.button_ll_3){
            Button btn2 = (Button)findViewById(R.id.button_ll_2);
            btn2.setVisibility(view.VISIBLE);
        }
        if(id == R.id.button_rl_3){
            Button btn2 = (Button)findViewById(R.id.button_rl_2
            );
            btn2.setVisibility(view.VISIBLE);
        }
    }
}
