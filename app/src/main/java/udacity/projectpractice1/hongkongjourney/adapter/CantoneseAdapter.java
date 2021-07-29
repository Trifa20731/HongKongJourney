package udacity.projectpractice1.hongkongjourney.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import udacity.projectpractice1.hongkongjourney.R;
import udacity.projectpractice1.hongkongjourney.dataModel.CantoneseData;

/**
 * This is the adapter class to connect the cantonese data and the list view.
 * There are two text view and one music player item.
 */

// TODO: Add the media player here to display the cantonese sentence. (After updating the data model)
// TODO: Change the listView to the Recycler View using the viewholder and the Adpater, or it will cause error in the activity setting.

public class CantoneseAdapter extends RecyclerView.Adapter<CantoneseAdapter.ViewHolder> {

    private static final String LOG_TAG = CantoneseAdapter.class.getSimpleName();

    private ArrayList<CantoneseData> localCantoneseDataArrayList;

    /**
     * Inner Class: Redefine the ViewHolder, in order to let the system know what should be contain on the
     * View holder then, we should define the item on the onBindViewHolder function.
     * <p>
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView cantoneseTransTextView;
        private final TextView englishTransTextView;

        public ViewHolder(View view) {
            super(view);

            // Define click listener for the ViewHolder's View
            cantoneseTransTextView = (TextView) view.findViewById(R.id.cantonese_item_canto_trans_text_view);
            englishTransTextView = (TextView) view.findViewById(R.id.cantonese_item_english_trans_text_view);
        }

        public TextView getCantoneseTransTextViewTextView() {
            return cantoneseTransTextView;
        }

        public TextView getEnglishTransTextView() {
            return englishTransTextView;
        }
    }

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param cantoneseDataArrayList ArrayList<CantoneseData> containing the data to populate views to be used
     *                               by RecyclerView.
     */
    public CantoneseAdapter(ArrayList<CantoneseData> cantoneseDataArrayList) {
        Log.v(LOG_TAG, "Constructor CantoneseAdapter: run");
        localCantoneseDataArrayList = cantoneseDataArrayList;
    }

    /**
     * We should create a view holder to draw our item contents.
     */
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        Log.v(LOG_TAG, "OnCreateViewHolder: run");

        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_item_cantonese, viewGroup, false);

        return new ViewHolder(view);
    }

    /**
     * Replace the contents of a view (invoked by the layout manager)
     * We should connect the data and the view together.
     */
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        Log.v(LOG_TAG, "OnBindViewHolder: run");

        CantoneseData currentCantonData = localCantoneseDataArrayList.get(position);

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.getCantoneseTransTextViewTextView().setText(currentCantonData.getCantoneseTranslation());
        viewHolder.getEnglishTransTextView().setText(currentCantonData.getEnglishTranslation());
    }

    /**
     * Count the number of our items.
     */
    @Override
    public int getItemCount() {
        return localCantoneseDataArrayList.size();
    }


}
