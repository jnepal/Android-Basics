package np.com.sabinb.recyclerviewdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import np.com.sabinb.recyclerviewdemo.R;
import np.com.sabinb.recyclerviewdemo.Student;


/**
 * Created by Sabin on 6/26/2015.
 */
public class StudentAdapter {
    private ArrayList<Student> studentList;
    public StudentAdapter() {
        studentList = new ArrayList<Student>();
    }
    public void addStudents(List<Student> students){
        studentList.addAll(students);
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_item, null);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        Student student =  studentList.get(position);
        holder.nameTv.setText(student.getName());
        holder.addressTv.setText(student.getAddress());
        holder.ageTv.setText(student.getAge()+"");
    }
    @Override
    public int getItemCount(){
        return studentList.size();
    }
    public static class ViewHolder extends RecyclerView.Adapter<StudentAdapter, ViewHolder>{
        private TextView nameTv;
        private TextView addressTv;
        private TextView ageTv;
        private ViewHolder(View itemView){
            super(itemView);
            nameTv = (TextView)itemView.findViewById(R.id.nameTv);
            addressTv = (TextView)itemView.findViewById(R.id.addressTv);
            ageTv = (TextView)itemView.findViewById(R.id.ageTv);

        }
    }
}
