package udacity.projectpractice1.hongkongjourney.datalist;

import java.util.ArrayList;

import udacity.projectpractice1.hongkongjourney.R;
import udacity.projectpractice1.hongkongjourney.dataModel.AttractionData;

/**
 * This class represents a attraction list which contains different attraction data.
 * Each objects has a arraylist to contain different kind of attraction
 * -- Initialize the attraction data in the data list.
 * -- not influence the controller.
 *
 * Some Note:
 * -- AttractionData: Name, Location, Image Source ID.
 * */

// TODO: add the image to the default function.

public class AttractionDataList {

    private ArrayList<AttractionData> attractionDataArrayList;

//---------------------------------------------------------Constructor------------------------------------------------------------------------------------------


    public AttractionDataList() {
        attractionDataArrayList = new ArrayList<AttractionData>();
        defaultSetAttractionDataList();
    }

    public AttractionDataList(ArrayList<AttractionData> attractionDataArrayList) {
        this.attractionDataArrayList = attractionDataArrayList;
    }


//---------------------------------------------------------Set and Get Functions--------------------------------------------------------------------------------


    public void setAttractionDataArrayList(ArrayList<AttractionData> attractionDataArrayList) {
        this.attractionDataArrayList = attractionDataArrayList;
    }

    public ArrayList<AttractionData> getAttractionDataArrayList() {
        return this.attractionDataArrayList;
    }

    //Defualt function to set the Attraction data list.
    private void defaultSetAttractionDataList() {
        attractionDataArrayList.add(new AttractionData("Avenue of Stars","Tsim Sha Tsui", R.drawable.alexandr_bormotin_unsplash));
        attractionDataArrayList.add(new AttractionData("Temple Street Night Market","Jordan", R.drawable.alexandr_bormotin_unsplash));
        attractionDataArrayList.add(new AttractionData("St John’s Cathedral","Central", R.drawable.alexandr_bormotin_unsplash));
        attractionDataArrayList.add(new AttractionData("Tai O Fishing Village","Tai O", R.drawable.alexandr_bormotin_unsplash));
    }
}
