package udacity.projectpractice1.hongkongjourney.dataModel;

// TODO: Add the cantonese pronunceation here.

public class CantoneseData {

    private String englishTranslation;
    private String cantoneseTranslation;

    public CantoneseData () {}

    public CantoneseData(String englishTranslation, String cantoneseTranslation) {
        this.englishTranslation = englishTranslation;
        this.cantoneseTranslation = cantoneseTranslation;
    }

//-----------------------------------------------------------------------------Get and Set Function------------------------------------------------------------


    public String getEnglishTranslation() {
        return englishTranslation;
    }

    public String getCantoneseTranslation() {
        return cantoneseTranslation;
    }

    public void setEnglishTranslation(String englishTranslation) {
        this.englishTranslation = englishTranslation;
    }

    public void setCantoneseTranslation(String cantoneseTranslation) {
        this.cantoneseTranslation = cantoneseTranslation;
    }


}
