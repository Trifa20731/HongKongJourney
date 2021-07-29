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
import udacity.projectpractice1.hongkongjourney.adapter.HotelAdapter;
import udacity.projectpractice1.hongkongjourney.datalist.HotelDataList;

public class HotelFragment extends Fragment {

    private final static  String LOG_TAG = HotelFragment.class.getSimpleName();
    private HotelDataList hotelDataList;
    private RecyclerView hotelRecyclerView;

    // The layout manager to control the recyclerview
    protected RecyclerView.LayoutManager mLayoutManager;
    int scrollPosition = 0;

    public HotelFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.v(LOG_TAG, "onCreate: run.");
        super.onCreate(savedInstanceState);
        hotelDataList = new HotelDataList();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_hotel, container, false);

        hotelRecyclerView = rootView.findViewById(R.id.hotel_page_recycler_view);

        // LinearLayoutManager is used here, this will layout the elements in a similar fashion
        // to the way ListView would layout elements. The RecyclerView.LayoutManager defines how
        // elements are laid out.
        mLayoutManager = new LinearLayoutManager(getActivity());
        hotelRecyclerView.setLayoutManager(mLayoutManager);
        hotelRecyclerView.scrollToPosition(scrollPosition);

        // Bind Adapter
        HotelAdapter hotelAdapter = new HotelAdapter(hotelDataList.getHotelDataArrayList());
        hotelRecyclerView.setAdapter(hotelAdapter);

        return rootView;
    }
}