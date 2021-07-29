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

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Locale;

import udacity.projectpractice1.hongkongjourney.R;
import udacity.projectpractice1.hongkongjourney.dataModel.AttractionData;
import udacity.projectpractice1.hongkongjourney.dataModel.ShoppingMallData;
import udacity.projectpractice1.hongkongjourney.datalist.ShoppingMallDataList;

/**
 * This is the adapter class to connect the shopping mall data and the list view.
 * There are five text view for name, lcation, time, No of store, No of restaurants, and one image view
 */

public class ShoppingMallAdapter extends RecyclerView.Adapter<ShoppingMallAdapter.ViewHolder>  {

    private final static String LOG_TAG = ShoppingMallAdapter.class.getSimpleName();

    private ArrayList<ShoppingMallData> localShoppingMallDataArrayList;

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param shoppingMallDataArrayList ArrayList<ShoppingMallData> containing the data to populate views to be used
     *                                by RecyclerView.
     */
    public ShoppingMallAdapter(ArrayList<ShoppingMallData> shoppingMallDataArrayList) {
        Log.v(LOG_TAG, "Constructor ShoppingMallAdapter: run");
        localShoppingMallDataArrayList = shoppingMallDataArrayList;
    }


    /**
     * Inner Class: Redefine the ViewHolder, in order to let the system know what should be contain on the
     * View holder then, we should define the item on the onBindViewHolder function.
     * <p>
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView shopMallNameTextView;
        private final TextView shopMallLocationTextView;
        private final TextView shopMallTimeTextView;
        private final TextView shopMallNoOfStoreTextView;
        private final TextView shopMallNoOfResTextView;
        private final ImageView shopMallImageView;

        public ViewHolder(View view) {
            super(view);

            // Bind the controller to the layout item.
            shopMallImageView = (ImageView) view.findViewById(R.id.shopping_mall_cover_image_view);
            shopMallLocationTextView = (TextView) view.findViewById(R.id.shopping_mall_item_location_text_view);
            shopMallNameTextView = (TextView) view.findViewById(R.id.shopping_mall_item_title_text_view);
            shopMallTimeTextView = (TextView) view.findViewById(R.id.shopping_mall_item_time_text_view);
            shopMallNoOfResTextView = (TextView) view.findViewById(R.id.shopping_mall_item_restaurants_text_view);
            shopMallNoOfStoreTextView = (TextView) view.findViewById(R.id.shopping_mall_item_store_text_view);
        }

        public TextView getShopMallNameTextView() {
            return shopMallNameTextView;
        }

        public TextView getShopMallTimeTextView() {
            return shopMallTimeTextView;
        }

        public TextView getShopMallLocationTextView() {
            return shopMallLocationTextView;
        }

        public TextView getShopMallNoOfResTextView() {
            return shopMallNoOfResTextView;
        }

        public TextView getShopMallNoOfStoreTextView() {
            return shopMallNoOfStoreTextView;
        }

        public ImageView getShopMallImageView() {
            return shopMallImageView;
        }
    }

    /**
     * Called when RecyclerView needs a new RecyclerView.ViewHolder of the given type to represent an item.
     * We define the view holder inner class to tell system what should we contain in the showing item.
     * Then we should tell system the layout structure.
     * */
    @NonNull
    @Override
    public ShoppingMallAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.v(LOG_TAG, "onCreateViewHolder: run");

        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_shopping_mall, parent, false);

        return new ShoppingMallAdapter.ViewHolder(view);
    }

    /**
     * Replace the contents of a view (invoked by the layout manager)
     * We should connect the data and the view together.
     */
    @Override
    public void onBindViewHolder(@NonNull ShoppingMallAdapter.ViewHolder holder, int position) {
        Log.v(LOG_TAG, "onBindViewHolder: run.");

        ShoppingMallData currentShoppingMallData = localShoppingMallDataArrayList.get(position);

        // We should assign the data to the view holder element.
        // TODO: Fix the int and String Problem
        holder.getShopMallImageView().setImageResource(currentShoppingMallData.getImageSrcID());
        holder.getShopMallLocationTextView().setText(currentShoppingMallData.getLocation());
        holder.getShopMallNameTextView().setText(currentShoppingMallData.getName());
        holder.getShopMallTimeTextView().setText(currentShoppingMallData.getTime());
        holder.getShopMallNoOfResTextView().setText(String.format(Locale.ENGLISH ,"No of Restaurant: %d", currentShoppingMallData.getNumberOfRestaurant()));
        holder.getShopMallNoOfStoreTextView().setText(String.format(Locale.ENGLISH, "No of Store: %d", currentShoppingMallData.getNumberOfStore() ));
    }

    /**
     * Tell system how may items in the list.
     * */
    @Override
    public int getItemCount() {
        return localShoppingMallDataArrayList.size();
    }


}
