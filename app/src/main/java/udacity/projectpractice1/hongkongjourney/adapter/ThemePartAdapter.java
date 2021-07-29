package udacity.projectpractice1.hongkongjourney.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Locale;

import udacity.projectpractice1.hongkongjourney.R;
import udacity.projectpractice1.hongkongjourney.dataModel.AttractionData;
import udacity.projectpractice1.hongkongjourney.dataModel.ThemeParkData;

/**
 * This is the adapter class to connect the theme park data and the list view.
 * There are four text view for time, name, location and price, also an image view.
 */

public class ThemePartAdapter extends RecyclerView.Adapter<ThemePartAdapter.ViewHolder> {

    private final static String LOG_TAG = ThemePartAdapter.class.getSimpleName();

    private ArrayList<ThemeParkData> localThemeParkDataArrayList;

    /**
     * Inner Class: Redefine the ViewHolder, in order to let the system know what should be contain on the
     * View holder then, we should define the item on the onBindViewHolder function.
     * <p>
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView parkNameTextView;
        private final TextView parkLocationTextView;
        private final TextView parkTimeTextView;
        private final TextView parkPriceTextView;
        private final ImageView parkImageView;

        public ViewHolder(View view) {
            super(view);

            parkNameTextView = (TextView) view.findViewById(R.id.theme_park_item_title_text_view);
            parkLocationTextView = (TextView) view.findViewById(R.id.theme_park_item_location_text_view);
            parkPriceTextView = (TextView) view.findViewById(R.id.theme_park_item_price_text_view);
            parkTimeTextView = (TextView) view.findViewById(R.id.theme_park_item_time_text_view);
            parkImageView = (ImageView) view.findViewById(R.id.theme_park_cover_image_view);
        }

        public TextView getParkNameTextView() {
            return parkNameTextView;
        }

        public TextView getParkLocationTextView() {
            return parkLocationTextView;
        }

        public TextView getParkPriceTextView() {
            return parkPriceTextView;
        }

        public TextView getParkTimeTextView() {
            return parkTimeTextView;
        }

        public ImageView getParkImageView() {
            return parkImageView;
        }
    }

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param themeParkDataArrayList ArrayList<ThemeParkData> containing the data to populate views to be used
     *                                by RecyclerView.
     */
    public ThemePartAdapter(ArrayList<ThemeParkData> themeParkDataArrayList) {
        Log.v(LOG_TAG, "Constructor ThemeParkAdapter: run");
        localThemeParkDataArrayList = themeParkDataArrayList;
    }

    // Called when RecyclerView needs a new RecyclerView.ViewHolder of the given type to represent an item
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.v(LOG_TAG, "onCreateViewHolder: run");

        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_theme_park, parent, false);

        return new ThemePartAdapter.ViewHolder(view);
    }

    /**
     * Replace the contents of a view (invoked by the layout manager)
     * We should connect the data and the view together.
     */
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ThemeParkData currentParkData = localThemeParkDataArrayList.get(position);

        // Assign the data to controller.
        // TODO: Fix the String and int problem.
        holder.getParkImageView().setImageResource(currentParkData.getImageSrcID());
        holder.getParkNameTextView().setText(currentParkData.getName());
        holder.getParkLocationTextView().setText(currentParkData.getLocation());
        holder.getParkPriceTextView().setText(String.format(Locale.ENGLISH,  "Price: %d", currentParkData.getPrice()));
        holder.getParkTimeTextView().setText(currentParkData.getTime());
    }

    /**
     * Tell system how may items in the list.
     * */
    @Override
    public int getItemCount() {
        return localThemeParkDataArrayList.size();
    }
}
