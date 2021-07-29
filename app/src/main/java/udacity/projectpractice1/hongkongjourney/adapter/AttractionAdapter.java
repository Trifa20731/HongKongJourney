package udacity.projectpractice1.hongkongjourney.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import udacity.projectpractice1.hongkongjourney.R;
import udacity.projectpractice1.hongkongjourney.dataModel.AttractionData;

/**
 * This is the adapter class to connect the attraction data and the list view.
 * There are two text view for name and location and one Image View.
 */

public class AttractionAdapter extends RecyclerView.Adapter<AttractionAdapter.ViewHolder> {

    private final static String LOG_TAG = AttractionAdapter.class.getSimpleName();

    private ArrayList<AttractionData> localAttractionDataArrayList;

    /**
     * Inner Class: Redefine the ViewHolder, in order to let the system know what should be contain on the
     * View holder then, we should define the item on the onBindViewHolder function.
     * <p>
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView attractionNameTextView;
        private final TextView attractionLocationTextView;
        private final ImageView attractionImageView;

        public ViewHolder(View view) {
            super(view);

            // Define click listener for the ViewHolder's View
            attractionNameTextView = (TextView) view.findViewById(R.id.attraction_item_title_text_view);
            attractionLocationTextView = (TextView) view.findViewById(R.id.attraction_item_location_text_view);
            attractionImageView = (ImageView) view.findViewById(R.id.attraction_cover_image_view);
        }

        public TextView getAttractionNameTextView() {
            return attractionNameTextView;
        }

        public TextView getAttractionLocationTextView() {
            return attractionLocationTextView;
        }

        public ImageView getAttractionImageView() {
            return attractionImageView;
        }
    }

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param attractionDataArrayList ArrayList<AttractionData> containing the data to populate views to be used
     *                                by RecyclerView.
     */
    public AttractionAdapter(ArrayList<AttractionData> attractionDataArrayList) {
        Log.v(LOG_TAG, "Constructor AttractionAdapter: run");
        localAttractionDataArrayList = attractionDataArrayList;
    }

    // Called when RecyclerView needs a new RecyclerView.ViewHolder of the given type to represent an item
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.v(LOG_TAG, "onCreateViewHolder: run");

        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_attraction, parent, false);

        return new ViewHolder(view);
    }

    /**
     * Replace the contents of a view (invoked by the layout manager)
     * We should connect the data and the view together.
     */
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.v(LOG_TAG, "OnBindViewHolder: run");

        AttractionData currentAttractionData    = localAttractionDataArrayList.get(position);

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        holder.getAttractionImageView().setImageResource(currentAttractionData.getImageSrcID());
        holder.getAttractionNameTextView().setText(currentAttractionData.getName());
        holder.getAttractionLocationTextView().setText(currentAttractionData.getLocation());
    }

    /**
     * Count the number of our items.
     */
    @Override
    public int getItemCount() {
        return localAttractionDataArrayList.size();
    }
}
