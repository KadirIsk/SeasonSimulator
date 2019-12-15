package enumTypes;

public enum Period {
    ONE_DAY("HER GÜN"),
    TWO_DAYS("2 GÜNDE BİR"),
    THREE_DAYS("3 GÜNDE BİR"),
    FOUR_DAYS("4 GÜNCE BİR"),
    FIVE_DAYS("5 GÜNDE BİR"),
    SIX_DAYS("6 GÜNDE BİR"),
    ONE_WEEK("HAFTADA BİR");

    private String period;
    Period(String period){
        this.period = period;
    }

    public String getPeriod(){
        return this.period;
    }
}
