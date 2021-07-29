package udacity.projectpractice1.hongkongjourney.datalist;

import java.util.ArrayList;

import udacity.projectpractice1.hongkongjourney.dataModel.CantoneseData;


/**
 * This class represents a Cantonese list which contains different Cantonese data.
 * Each objects has a arraylist to contain different kind of Cantonese
 * -- Initialize the Cantonese data in the data list.
 * -- not influence the controller.
 *
 * Some Note:
 * -- CantoneseData: English Translation, Cantonese Translation.W
 * */

// TODO: Add the data to the default function.(After modifying the media data)

public class CantoneseDataList {

    private ArrayList<CantoneseData> cantoneseDataArrayList;


//---------------------------------------------------------Constructor------------------------------------------------------------------------------------------


    public CantoneseDataList() {
        cantoneseDataArrayList = new ArrayList<CantoneseData>();
        defaultSetCantoneseDataArrayList();
    }

    public CantoneseDataList(ArrayList<CantoneseData> cantoneseDataArrayList) {
        this.cantoneseDataArrayList = cantoneseDataArrayList;
    }


//---------------------------------------------------------Set and Get Functions--------------------------------------------------------------------------------


    // The default setting function to set the Cantonese data.
    public void defaultSetCantoneseDataArrayList() {
        cantoneseDataArrayList.add(new CantoneseData("Welcome","歡迎"));
        cantoneseDataArrayList.add(new CantoneseData("Hello","你好"));
        cantoneseDataArrayList.add(new CantoneseData("Long time no see","好耐冇見"));
        cantoneseDataArrayList.add(new CantoneseData("Good luck!","祝你好運"));
        cantoneseDataArrayList.add(new CantoneseData("I don't know","我唔知道"));
        cantoneseDataArrayList.add(new CantoneseData("Excuse me","唔該"));
    }

    public ArrayList<CantoneseData> getCantoneseDataArrayList() {
        return cantoneseDataArrayList;
    }

    public void setCantoneseDataArrayList(ArrayList<CantoneseData> cantoneseDataArrayList) {
        this.cantoneseDataArrayList = cantoneseDataArrayList;
    }
}
