package np.com.sabinb.customlistview;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {
    private ListView listView;
    private List<Employee>employeeList;
    private EmployeeAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.listView);

        employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(1, "Hali Bahadur", "Bhaktapur", 45));
        employeeList.add(new Employee(2, "Shyam Bahadur", "Kathmandu", 35));
        employeeList.add(new Employee(3, "Sagar Thapa", "Patan", 30));

        adapter = new EmployeeAdapter(getApplicationContext(), employeeList);
        listView.setAdapter(adapter);
    }
}
