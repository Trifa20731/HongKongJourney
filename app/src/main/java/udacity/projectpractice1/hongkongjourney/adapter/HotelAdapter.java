package udacity.projectpractice1.hongkongjourney.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Locale;

import udacity.projectpractice1.hongkongjourney.R;
import udacity.projectpractice1.hongkongjourney.dataModel.HotelData;

/**
 * This is the adapter class to connect the hotel data and the list view.
 * There are three text view for the name, location,price, and one Image View.
 */

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.ViewHolder> {

    private final static String LOG_TAG = HotelAdapter.class.getSimpleName();

    private ArrayList<HotelData> localHotelDataArrayList;

    /**
     * Inner Class: Redefine the ViewHolder, in order to let the system know what should be contain on the
     * View holder then, we should define the item on the onBindViewHolder function.
     * <p>
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView hotelNameTextView;
        private final TextView hotelLocationTextView;
        private final TextView hotelPriceTextView;
        private final ImageView hotelImageView;

        public ViewHolder(View view) {
            super(view);

            hotelImageView = (ImageView) view.findViewById(R.id.hotel_cover_image_view);
            hotelNameTextView = (TextView) view.findViewById(R.id.hotel_item_title_text_view);
            hotelLocationTextView = (TextView) view.findViewById(R.id.hotel_item_location_text_view);
            hotelPriceTextView = (TextView) view.findViewById(R.id.hotel_item_price_text_view);
        }

        public ImageView getHotelImageView() {
            return hotelImageView;
        }

        public TextView getHotelLocationTextView() {
            return hotelLocationTextView;
        }

        public TextView getHotelNameTextView() {
            return hotelNameTextView;
        }

        public TextView getHotelPriceTextView() {
            return hotelPriceTextView;
        }
    }

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param hotelDataArrayList ArrayList<HotelData> containing the data to populate views to be used
     *                                by RecyclerView.
     */
    public HotelAdapter(ArrayList<HotelData> hotelDataArrayList) {
        Log.v(LOG_TAG, "HotelAdapter Constructor: run.");
        localHotelDataArrayList = hotelDataArrayList;
    }

    /**
     * Called when RecyclerView needs a new RecyclerView.ViewHolder of the given type to represent an item.
     * We define the view holder inner class to tell system what should we contain in the showing item.
     * Then we should tell system the layout structure.
     * */

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.v(LOG_TAG, "onCreateViewHolder: run");

        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_hotel, parent, false);

        return new HotelAdapter.ViewHolder(view);
    }

    /**
     * Replace the contents of a view (invoked by the layout manager)
     * We should connect the data and the view together.
     */
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.v(LOG_TAG, "onBindViewHolder: run");

        HotelData currentHotelData = localHotelDataArrayList.get(position);

        // We should assign the UI component to the view holder controller.
        // TODO: Fix the String and Int Problem
        holder.getHotelImageView().setImageResource(currentHotelData.getImageSrcID());
        holder.getHotelNameTextView().setText(currentHotelData.getName());
        holder.getHotelLocationTextView().setText(currentHotelData.getLocation());
        holder.getHotelPriceTextView().setText(String.format(Locale.ENGLISH,"Price: %d", currentHotelData.getPrice()) );
    }

    /**
     * Tell system how many item should be in the list.
     * */
    @Override
    public int getItemCount() {
        return localHotelDataArrayList.size();
    }


}
