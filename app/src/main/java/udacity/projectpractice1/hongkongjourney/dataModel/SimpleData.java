package udacity.projectpractice1.hongkongjourney.dataModel;

public class SimpleData {

    protected String name;
    protected String location;
    protected int imageSrcID;

    public SimpleData() {

    }

//-----------------------------------------------------------------------------Set and Get Functions------------------------------------------------------------

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getImageSrcID() {
        return imageSrcID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setImageSrcID(int imageSrcID) {
        this.imageSrcID = imageSrcID;
    }
}
