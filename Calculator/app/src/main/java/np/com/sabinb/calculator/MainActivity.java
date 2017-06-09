package np.com.sabinb.calculator;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    public Button btn;
    public EditText editText1;
    public EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.button);
        editText1 = (EditText)findViewById(R.id.editText);
        editText2 = (EditText)findViewById(R.id.editText2);



        btn.setOnClickListener(this);

    }

    public int sum(){
        String a = editText1.getText().toString();
        String b = editText2.getText().toString();
        int sum = Integer.parseInt(a)+Integer.parseInt(b);
        return sum;

    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        int sum = sum();
        intent.putExtra("KEY_1", sum);
        startActivity(intent);

    }



}
