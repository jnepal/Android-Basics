package np.com.sabinb.mysqldatabasedemo;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    private ListView listView;
    private List<Data> dataList;
    private DataAdapter adapter;
    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = (ProgressBar)findViewById(R.id.progressBar);
        listView = (ListView)findViewById(R.id.listView);
        dataList = new ArrayList<Data>();


        adapter = new DataAdapter(getApplicationContext(), dataList);
        listView.setAdapter(adapter);

        //new GetData().execute();
    }

    private class GetData extends AsyncTask<Void, Void, List<Data>>{
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressBar.setVisibility(View.VISIBLE);
        }

        @Override
        protected List<Data> doInBackground(Void... params) {
            ServiceHandler serviceHandler = new ServiceHandler();
            String result = serviceHandler.makeServiceCall(Constant.URL+"?call=select", ServiceHandler.GET);
            if(result == null) {
                return null;
            }
            List<Data> datas = new ArrayList<Data>();
            Log.i("RESULT", "Result" + result);

            try {
                JSONObject parentObject = new JSONObject(result);
                JSONArray parentArray = parentObject.getJSONArray("");

                for(int i=0; i<parentArray.length(); i++){
                    Data data = new Data();
                    JSONObject jsonObject = parentArray.getJSONObject(i);
                    data.setName(jsonObject.getString("name"));
                    data.setDuration(jsonObject.getString("duration"));
                    data.setTitle(jsonObject.getString("title"));

                    datas.add(data);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return datas;

        }

        @Override
        protected void onPostExecute(List<Data> datas) {
            super.onPostExecute(datas);
            dataList.addAll(datas);
            adapter.notifyDataSetChanged();
            progressBar.setVisibility(View.GONE);
        }


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
        if(id == R.id.action_add){
            Intent intent = new Intent(getApplicationContext(), AddActivity.class);
            startActivity(intent);

        }

        return super.onOptionsItemSelected(item);
    }
}
