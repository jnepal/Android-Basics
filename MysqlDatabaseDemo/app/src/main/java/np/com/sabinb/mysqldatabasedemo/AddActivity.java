package np.com.sabinb.mysqldatabasedemo;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class AddActivity extends ActionBarActivity {
    private EditText nameEt;
    private EditText titleEt;
    private EditText durationEt;
    public String name, title;
    public int duration;
    private List<NameValuePair>nvp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        nameEt = (EditText)findViewById(R.id.nameEt);
        titleEt = (EditText)findViewById(R.id.titleEt);
        durationEt = (EditText)findViewById(R.id.durationEt);
        nvp = new ArrayList<NameValuePair>();


    }
    public void btnClick(View view){
        switch (view.getId()){
            case R.id.submitBtn:
                name = nameEt.getText().toString().trim();
                title = titleEt.getText().toString().trim();
                duration = Integer.parseInt(durationEt.getText().toString().trim());
                new AddData().execute();
                //Toast.makeText(getApplicationContext(), name + "\n" + title + "\n" + duration, Toast.LENGTH_LONG).show();
                break;
            case R.id.viewBtn:
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                break;
        }
    }
    private class AddData extends AsyncTask<Void, Void, Void> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();

        }

        @Override
        protected Void doInBackground(Void... params) {
            ServiceHandler serviceHandler = new ServiceHandler();
            nvp.add(new BasicNameValuePair("call", "insert"));
            nvp.add(new BasicNameValuePair("name", name));
            nvp.add(new BasicNameValuePair("title", title));
            nvp.add(new BasicNameValuePair("duration", duration+""));
            String result = serviceHandler.makeServiceCall(Constant.URL, ServiceHandler.GET, nvp);
            if (result == null) {
                return null;
            }


            return null;

        }

    }

}
