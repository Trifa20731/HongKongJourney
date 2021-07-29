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
import udacity.projectpractice1.hongkongjourney.adapter.ThemePartAdapter;
import udacity.projectpractice1.hongkongjourney.dataModel.ThemeParkData;
import udacity.projectpractice1.hongkongjourney.datalist.ThemeParkDataList;

public class ThemePartFragment extends Fragment {

    private final static String LOG_TAG = ThemePartFragment.class.getSimpleName();

    private ThemeParkDataList themeParkDataList;

    private RecyclerView themeParkRecyclerView;

    // The layout manager to control the recyclerview
    protected RecyclerView.LayoutManager mLayoutManager;
    int scrollPosition = 0;

    public ThemePartFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.v(LOG_TAG, "onCreate: run.");
        super.onCreate(savedInstanceState);
        themeParkDataList = new ThemeParkDataList();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_theme_part, container, false);

        themeParkRecyclerView = rootView.findViewById(R.id.theme_park_page_recycler_view);

        // LinearLayoutManager is used here, this will layout the elements in a similar fashion
        // to the way ListView would layout elements. The RecyclerView.LayoutManager defines how
        // elements are laid out.
        mLayoutManager = new LinearLayoutManager(getActivity());
        themeParkRecyclerView.setLayoutManager(mLayoutManager);
        themeParkRecyclerView.scrollToPosition(scrollPosition);

        // Bind Adapter
        ThemePartAdapter themePartAdapter = new ThemePartAdapter(themeParkDataList.getThemeParkDataArrayList());
        themeParkRecyclerView.setAdapter(themePartAdapter);

        return rootView;
    }
}