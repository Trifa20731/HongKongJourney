package udacity.projectpractice1.hongkongjourney.control;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import udacity.projectpractice1.hongkongjourney.R;
import udacity.projectpractice1.hongkongjourney.adapter.ExploreAdapter;

public class ExploreActivity extends AppCompatActivity {

    TabLayout exploreTabLayout;
    ViewPager exploreViewPager;

    ExploreAdapter exploreAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_explore);

        // Find the view pager that will allow the user to swipe between fragments
        exploreViewPager = (ViewPager) findViewById(R.id.explore_viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        exploreAdapter = new ExploreAdapter(getSupportFragmentManager(), ExploreActivity.this);

        // Set the adapter onto the view pager
        exploreViewPager.setAdapter(exploreAdapter);

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.explore_sliding_tabs);
        tabLayout.setupWithViewPager(exploreViewPager);
    }
}