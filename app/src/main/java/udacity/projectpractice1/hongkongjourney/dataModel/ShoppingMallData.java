package udacity.projectpractice1.hongkongjourney.dataModel;

public class ShoppingMallData extends SimpleData{

    private String time;
    private int numberOfStore;
    private int numberOfRestaurant;

    public ShoppingMallData() {

    }

    public ShoppingMallData(String name, String location, int imageSrcID, String time, int numberOfStore, int numberOfRestaurant) {
        this.name = name;
        this.location = location;
        this.imageSrcID = imageSrcID;
        this.time = time;
        this.numberOfRestaurant = numberOfRestaurant;
        this.numberOfStore = numberOfStore;
    }

//-----------------------------------------------------------------------------Set and Get Functions------------------------------------------------------------

    public String getTime() {
        return time;
    }

    public int getNumberOfStore() {
        return numberOfStore;
    }

    public int getNumberOfRestaurant() {
        return numberOfRestaurant;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setNumberOfStore(int numberOfStore) {
        this.numberOfStore = numberOfStore;
    }

    public void setNumberOfRestaurant(int numberOfRestaurant) {
        this.numberOfRestaurant = numberOfRestaurant;
    }
}
