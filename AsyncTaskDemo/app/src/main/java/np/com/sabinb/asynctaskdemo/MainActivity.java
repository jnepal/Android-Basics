package np.com.sabinb.asynctaskdemo;

import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private TextView textView;
    private Button button;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);
        button = (Button)findViewById(R.id.button);
        progressBar = (ProgressBar)findViewById(R.id.progressBar);
    }


    public void btnClick(View view) {
        new MyAsyncTask().execute(2000,3000);
    }

    private class MyAsyncTask extends AsyncTask<Integer, String, String>{

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressBar.setVisibility(View.VISIBLE);
            textView.setText("background task started");
        }

        @Override
        protected String doInBackground(Integer... params) {
            try {
                //Thread.sleep(2000); can be hard coded like this the parameter in function and class must be Void... params
                Thread.sleep(params[0]);//for this the parameter in the function and class must be INTEGER... params
                publishProgress("In the Middle of task");
                Thread.sleep(params[1]);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            return "Task Completed";
        }

        @Override
        protected void onProgressUpdate(String... params) {
            super.onProgressUpdate(params);
            textView.setText(params[0]);

        }

        @Override
        protected void onPostExecute(String params) {
            super.onPostExecute(params);
            progressBar.setVisibility(View.GONE);
            textView.setText(params);
        }
    }
}
