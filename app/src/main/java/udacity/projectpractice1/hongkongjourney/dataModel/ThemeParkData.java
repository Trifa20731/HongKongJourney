package udacity.projectpractice1.hongkongjourney.dataModel;

public class ThemeParkData extends SimpleData {

    private String time;
    private int price;

    public ThemeParkData() {}

    public ThemeParkData(String name, String location, int imageSrcID, String time, int price) {
        this.name = name;
        this.location = location;
        this.imageSrcID = imageSrcID;
        this.time = time;
        this.price = price;
    }
//-----------------------------------------------------------------------------Set and Get Functions------------------------------------------------------------


    public String getTime() {
        return time;
    }

    public int getPrice() {
        return price;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
