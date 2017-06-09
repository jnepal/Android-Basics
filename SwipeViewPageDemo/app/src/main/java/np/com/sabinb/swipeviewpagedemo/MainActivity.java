package np.com.sabinb.swipeviewpagedemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {
    private ViewPager viewPager;
    private MyPageAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager)findViewById(R.id.viewPager);
        adapter = new MyPageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

    }
    private class MyPageAdapter extends FragmentPagerAdapter{

        private MyPageAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new FragmentOne();

                case 1:
                    return new FragmentTwo();

                case 2:
                    return new FragmentThree();

                case 3:
                    return new FragmentFour();

            }
            return null;
        }

        @Override
        public int getCount() {
            return 4;
        }
    }


}
