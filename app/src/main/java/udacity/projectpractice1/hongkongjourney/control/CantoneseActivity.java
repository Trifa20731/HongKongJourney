package udacity.projectpractice1.hongkongjourney.control;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

import udacity.projectpractice1.hongkongjourney.R;
import udacity.projectpractice1.hongkongjourney.adapter.CantoneseAdapter;
import udacity.projectpractice1.hongkongjourney.datalist.CantoneseDataList;

//TODO: We can implement the recycler view in the activity but there are some layout problem should be fixed.

public class CantoneseActivity extends AppCompatActivity implements RecyclerView.OnItemTouchListener {

    private static final String LOG_TAG = CantoneseActivity.class.getSimpleName();

    private CantoneseDataList cantoneseDataList;

    private RecyclerView cantoneseRecyclerView;

    // The layout manager to control the recyclerview
    protected RecyclerView.LayoutManager mLayoutManager;
    int scrollPosition = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cantonese);
        Log.v(LOG_TAG, "OnCreate: Run");

        //Create a new cantonese data list with default data.
        cantoneseDataList = new CantoneseDataList();

        //Assign the id to the element.
        cantoneseRecyclerView = findViewById(R.id.cantoenese_page_recycler_view);

        // LinearLayoutManager is used here, this will layout the elements in a similar fashion
        // to the way ListView would layout elements. The RecyclerView.LayoutManager defines how
        // elements are laid out.
        mLayoutManager = new LinearLayoutManager(this);
        cantoneseRecyclerView.setLayoutManager(mLayoutManager);
        cantoneseRecyclerView.scrollToPosition(scrollPosition);

        //Bind the adapter to the recycler view and cantonese data.
        CantoneseAdapter cantoneseAdapter = new CantoneseAdapter(cantoneseDataList.getCantoneseDataArrayList());
        cantoneseRecyclerView.setAdapter(cantoneseAdapter);

    }

    @Override
    public boolean onInterceptTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {
        return false;
    }

    @Override
    public void onTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {

    }

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

    }
}
