package udacity.projectpractice1.hongkongjourney.datalist;

import java.util.ArrayList;

import udacity.projectpractice1.hongkongjourney.R;
import udacity.projectpractice1.hongkongjourney.dataModel.ShoppingMallData;

// TODO: Add the data to the default function.

/**
 * This class represents a ShoppingMall list which contains different ShoppingMall data.
 * Each objects has a arraylist to contain different kind of ShoppingMall
 * -- Initialize the ShoppingMall data in the data list.
 * -- not influence the controller.
 *
 * Some Note:
 * -- ShoppingMallData: Name, Location, Image Source ID, Time, Number of Store, Number of Restaurants.
 * */

public class ShoppingMallDataList {

    private ArrayList<ShoppingMallData> shoppingMallDataArrayList;


//---------------------------------------------------------Constructor------------------------------------------------------------------------------------------


    public ShoppingMallDataList() {
        shoppingMallDataArrayList = new ArrayList<ShoppingMallData>();
        defaultSetShoppingMallDataArrayList();
    }

    public ShoppingMallDataList(ArrayList<ShoppingMallData> shoppingMallDataArrayList) {
        this.shoppingMallDataArrayList = shoppingMallDataArrayList;
    }


//---------------------------------------------------------Set and Get Functions--------------------------------------------------------------------------------


    // The default setting function to set the Shopping Mall data.
    public void defaultSetShoppingMallDataArrayList() {
        shoppingMallDataArrayList.add(
                new ShoppingMallData("The Landmark Hong Kong",
                        "Central",
                        R.drawable.emily_xie_unsplash,
                        "10:00 - 22:00",
                        300,
                        60));
        shoppingMallDataArrayList.add(
                new ShoppingMallData("Harbour City",
                        "Tsim Sha Tsui",
                        R.drawable.emily_xie_unsplash,
                        "10:00 - 22:00",
                        700,
                        50));
        shoppingMallDataArrayList.add(
                new ShoppingMallData("Pacific Place Hong Kong",
                        "Central",
                        R.drawable.emily_xie_unsplash,
                        "10:00 - 22:00",
                        600,
                        47));
        shoppingMallDataArrayList.add(
                new ShoppingMallData("IFC Mall",
                        "Central",
                        R.drawable.emily_xie_unsplash,
                        "10:00 - 22:00",
                        200,
                        35));
    }

    public ArrayList<ShoppingMallData> getShoppingMallDataArrayList() {
        return shoppingMallDataArrayList;
    }

    public void setShoppingMallDataArrayList(ArrayList<ShoppingMallData> shoppingMallDataArrayList) {
        this.shoppingMallDataArrayList = shoppingMallDataArrayList;
    }
}
