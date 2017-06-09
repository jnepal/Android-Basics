package np.com.sabinb.jsondemowithasynctask;

import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {
    private ListView listView;
    private List<Contact> contactList;
    private ContactAdapter adapter;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        progressBar = (ProgressBar)findViewById(R.id.progressBar);
        listView = (ListView)findViewById(R.id.listView);
        contactList = new ArrayList<Contact>();
        adapter = new ContactAdapter(getApplicationContext(), contactList);
        listView.setAdapter(adapter);

        new GetTwitterTask().execute();
    }

    private class GetTwitterTask extends AsyncTask<Void, Void, List<Contact>> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressBar.setVisibility(View.VISIBLE);

        }

        @Override
        protected List<Contact> doInBackground(Void... params) {
            ServiceHandler serviceHandler = new ServiceHandler();
            String result = serviceHandler.makeServiceCall(Constant.URL, ServiceHandler.GET);
            if(result == null){
                return null;
            }
            List<Contact> contacts = new ArrayList<Contact>();
            //Log.i("RESULT", "Result" + result);

            try{
                JSONObject parentObject = new JSONObject(result);
                if(parentObject.has("contacts")){
                    JSONArray parentArray = parentObject.getJSONArray("contacts");
                    for(int i=0;i<parentArray.length();i++){
                        Contact contact = new Contact();
                        JSONObject jsonObject = parentArray.getJSONObject(i);
                        String name = jsonObject.getString("name");
                        String email = jsonObject.getString("email");
                        JSONObject phoneObject = jsonObject.getJSONObject("phone");
                        String phone = phoneObject.getString("mobile");
                        //Log.i("Name ", name);

                        contact.setName(name);
                        contact.setPhoneNo(phone);
                        contact.setEmail(email);
                        contacts.add(contact);

                    }


                }

            } catch (JSONException e) {
                e.printStackTrace();
            }
            return contacts;
        }

        @Override
        protected void onPostExecute(List<Contact> contacts) {
            super.onPostExecute(contacts);
            if(!isCancelled()){
                if(contacts!= null){
                    if(contacts.size() > 0){
                        contactList.addAll(contacts);
                        adapter.notifyDataSetChanged();

                    }
                }else{
                    Toast.makeText(getApplicationContext(), "Something Went Wrong", Toast.LENGTH_LONG);
                }
                progressBar.setVisibility(View.GONE);
            }
        }
    }
}
