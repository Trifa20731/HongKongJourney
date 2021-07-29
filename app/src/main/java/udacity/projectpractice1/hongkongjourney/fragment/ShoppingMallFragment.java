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
import udacity.projectpractice1.hongkongjourney.adapter.ShoppingMallAdapter;
import udacity.projectpractice1.hongkongjourney.datalist.ShoppingMallDataList;

public class ShoppingMallFragment extends Fragment {

    private final static  String LOG_TAG = ShoppingMallFragment.class.getSimpleName();

    private ShoppingMallDataList shoppingMallDataList;

    private RecyclerView shoppingMallRecyclerView;

    // The layout manager to control the recyclerview
    protected RecyclerView.LayoutManager mLayoutManager;
    int scrollPosition = 0;

    public ShoppingMallFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.v(LOG_TAG, "onCreate: run");
        super.onCreate(savedInstanceState);
        shoppingMallDataList = new ShoppingMallDataList();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_shopping_mall, container, false);

        shoppingMallRecyclerView = rootView.findViewById(R.id.shopping_mall_page_recycler_view);

        // LinearLayoutManager is used here, this will layout the elements in a similar fashion
        // to the way ListView would layout elements. The RecyclerView.LayoutManager defines how
        // elements are laid out.
        mLayoutManager = new LinearLayoutManager(getActivity());
        shoppingMallRecyclerView.setLayoutManager(mLayoutManager);
        shoppingMallRecyclerView.scrollToPosition(scrollPosition);

        // Bind Adapter
        ShoppingMallAdapter shoppingMallAdapter = new ShoppingMallAdapter(shoppingMallDataList.getShoppingMallDataArrayList());
        shoppingMallRecyclerView.setAdapter(shoppingMallAdapter);

        return rootView;
    }
}