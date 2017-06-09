package np.com.sabinb.fragmentdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by Sabin on 6/16/2015.
 */
public class FragmentTwo extends Fragment {
    private ListView listView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_two, container, false);
        listView = (ListView)view.findViewById(R.id.listView);

        return view;

    }
}
