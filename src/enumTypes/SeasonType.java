package enumTypes;

public enum SeasonType {
    SPRING("ILKBAHAR"),
    SUMMER("YAZ"),
    AUTUMN("SONBAHAR"),
    WINTER("KIŞ");

    private String season;
    SeasonType(String season) {
        this.season = season;
    }

    public String getSeason(){
        return this.season;
    }
}
