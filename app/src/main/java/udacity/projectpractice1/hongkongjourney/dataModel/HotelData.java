package udacity.projectpractice1.hongkongjourney.dataModel;

public class HotelData extends SimpleData {

    private int price;

    public HotelData(){}

    public HotelData(String name, String location, int imageSrcID, int price) {
        this.name = name;
        this.location = location;
        this.imageSrcID = imageSrcID;
        this.price = price;
    }


//-----------------------------------------------------------------------------Set and Get Functions------------------------------------------------------------


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
