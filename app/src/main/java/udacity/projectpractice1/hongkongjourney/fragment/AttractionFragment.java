package udacity.projectpractice1.hongkongjourney.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import udacity.projectpractice1.hongkongjourney.R;
import udacity.projectpractice1.hongkongjourney.adapter.AttractionAdapter;
import udacity.projectpractice1.hongkongjourney.datalist.AttractionDataList;

public class AttractionFragment extends Fragment {

    private final static String LOG_TAG = AttractionFragment.class.getSimpleName();

    private AttractionDataList attractionDataList;

    private RecyclerView attractionRecyclerView;

    // The layout manager to control the recyclerview
    protected RecyclerView.LayoutManager mLayoutManager;
    int scrollPosition = 0;

    public AttractionFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(LOG_TAG,"onCreate: Run.");
        attractionDataList = new AttractionDataList();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_attraction, container, false);

        attractionRecyclerView = rootView.findViewById(R.id.attraction_page_recycler_view);

        // LinearLayoutManager is used here, this will layout the elements in a similar fashion
        // to the way ListView would layout elements. The RecyclerView.LayoutManager defines how
        // elements are laid out.
        mLayoutManager = new LinearLayoutManager(getActivity());
        attractionRecyclerView.setLayoutManager(mLayoutManager);
        attractionRecyclerView.scrollToPosition(scrollPosition);

        // Bind Adapter
        AttractionAdapter attractionAdapter = new AttractionAdapter(attractionDataList.getAttractionDataArrayList());
        attractionRecyclerView.setAdapter(attractionAdapter);

        return rootView;
    }
}