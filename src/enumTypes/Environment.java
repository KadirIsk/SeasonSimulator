package enumTypes;

public enum Environment {
    LAND("KARA"),
    SEA("DENİZ"),
    SKY("HAVA");

    private String environment;
    Environment(String environment){
        this.environment = environment;
    }

    public String getEnvironment(){
        return this.environment;
    }
}
