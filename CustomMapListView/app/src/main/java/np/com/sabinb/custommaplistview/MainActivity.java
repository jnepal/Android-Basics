package np.com.sabinb.custommaplistview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MainActivity extends ActionBarActivity {
    private ListView listView;
    private List<Map<String, Object>> data;
    private EmployeeAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listView);
        data = new ArrayList<Map<String, Object>>();

        Map<String, Object> emp = new HashMap<String, Object>();
        emp.put("Name", "Sabin");
        emp.put("Address", "Kathmandu");
        emp.put("age", 20);

        Map<String, Object>emp2 = new HashMap<String, Object>();
        emp2.put("Name", "Ram");
        emp2.put("Address", "Bhaktapur");
        emp.put("age", 25);

        data.add(emp);
        data.add(emp2);

        adapter = new EmployeeAdapter(getApplicationContext(), data);
        listView.setAdapter(adapter);
    }
}
