package udacity.projectpractice1.hongkongjourney.datalist;

import java.util.ArrayList;

import udacity.projectpractice1.hongkongjourney.R;
import udacity.projectpractice1.hongkongjourney.dataModel.ThemeParkData;

// TODO: change the default function and add comment.

/**
 * This class represents a ThemePark list which contains different ThemePark data.
 * Each objects has a arraylist to contain different kind of ThemePark
 * -- Initialize the ThemePark data in the data list.
 * -- not influence the controller.
 *
 * Some Note:
 * -- ThemeParkData: Name, Location, Image Source ID, Opening time, price.
 * */

public class ThemeParkDataList {

    private ArrayList<ThemeParkData> themeParkDataArrayList;


//---------------------------------------------------------Constructor------------------------------------------------------------------------------------------


    public ThemeParkDataList() {
        themeParkDataArrayList = new ArrayList<ThemeParkData>();
        defaultSetThemeParkDataArrayList();
    }

    public ThemeParkDataList(ArrayList<ThemeParkData> themeParkDataArrayList) {
        this.themeParkDataArrayList = themeParkDataArrayList;
    }


//---------------------------------------------------------Set and Get Functions--------------------------------------------------------------------------------

    // The default setting function to set the Theme Park data.
    private void defaultSetThemeParkDataArrayList() {
        this.themeParkDataArrayList.add(new ThemeParkData("Hong Kong Park","Central", R.drawable.yu_kato_unsplash,"All Day",0));
        this.themeParkDataArrayList.add(new ThemeParkData("Ocean Park","Bays Area",R.drawable.yu_kato_unsplash,"All Day",526));
        this.themeParkDataArrayList.add(new ThemeParkData("Kowloon Park","Tsim Sha Tsui",R.drawable.yu_kato_unsplash,"All Day",0));
        this.themeParkDataArrayList.add(new ThemeParkData("Shek O Beach","Shek O",R.drawable.yu_kato_unsplash,"All Day",0));
    }

    public void setThemeParkDataArrayList(ArrayList<ThemeParkData> themeParkDataArrayList) {
        this.themeParkDataArrayList = themeParkDataArrayList;
    }

    public ArrayList<ThemeParkData> getThemeParkDataArrayList() {
        return this.themeParkDataArrayList;

    }
}
