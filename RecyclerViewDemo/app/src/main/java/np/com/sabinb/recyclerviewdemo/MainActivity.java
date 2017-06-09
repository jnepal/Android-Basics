package np.com.sabinb.recyclerviewdemo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import np.com.sabinb.recyclerviewdemo.adapter.StudentAdapter;


public class MainActivity extends ActionBarActivity {
    private StudentAdapter adapter;
    private RecyclerView recyclerView;
    private LinearlayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        adapter = new StudentAdapter();
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student();
        s1.setName("Hello");
        s1.setAddress("Nepal");
        s1.setAge(25);

        Student s2 = new Student();
        s2.setName("Hello");
        s2.setAddress("Nepal");
        s2.setAge(52);

        adapter.addStudents(students);
    }


}
