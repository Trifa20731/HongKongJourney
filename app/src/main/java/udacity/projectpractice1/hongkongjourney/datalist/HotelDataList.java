package udacity.projectpractice1.hongkongjourney.datalist;

import java.util.ArrayList;

import udacity.projectpractice1.hongkongjourney.R;
import udacity.projectpractice1.hongkongjourney.dataModel.HotelData;

/**
 * This class represents a hotel list which contains different hotel data.
 * Each objects has a arraylist to contain different kind of hotel
 * -- Initialize the hotel data in the data list.
 * -- not influence the controller.
 *
 * Some Note:
 * -- HotelData: Name, Location, Image Source ID, Price
 * */

// TODO: add the image to the default function.

public class HotelDataList {

    private ArrayList<HotelData> hotelDataArrayList;


//---------------------------------------------------------Constructor------------------------------------------------------------------------------------------


    public HotelDataList() {
        hotelDataArrayList = new ArrayList<HotelData>();
        defaultSetHotelDataList();
    }

    public HotelDataList(ArrayList<HotelData> hotelDataArrayList) {
        this.hotelDataArrayList = hotelDataArrayList;
    }


//---------------------------------------------------------Set and Get Functions--------------------------------------------------------------------------------


    // The default setting function to set the Hotel data.
    private void defaultSetHotelDataList() {
        this.hotelDataArrayList.add(new HotelData("Four Seasons Hotel", "Hong Kong", R.drawable.antonio_sokic_unsplash, 256));
        this.hotelDataArrayList.add(new HotelData("The Landmark Mandarin Oriental", "Hong Kong", R.drawable.antonio_sokic_unsplash, 361));
        this.hotelDataArrayList.add(new HotelData("The Peninsula", "Hong Kong", R.drawable.antonio_sokic_unsplash, 264));
        this.hotelDataArrayList.add(new HotelData("InterContinental", "Hong Kong", R.drawable.antonio_sokic_unsplash, 220));
    }

    public void setHotelDataArrayList(ArrayList<HotelData> hotelDataArrayList) {
        this.hotelDataArrayList = hotelDataArrayList;
    }

    public ArrayList<HotelData> getHotelDataArrayList() {
        return this.hotelDataArrayList;
    }
}
