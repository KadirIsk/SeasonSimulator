package entity;

public class TemperatureCondition {
    private double seasonTemperature;
    private double seasonMinTemperature;
    private double seasonMaxTemperature;

    public TemperatureCondition(){
        seasonMinTemperature = 0;
        seasonTemperature = 0;
        seasonMaxTemperature = 0;

    }

    public double getSeasonTemperature() {
        return seasonTemperature;
    }

    public void setSeasonTemperature(double seasonTemperature) {
        this.seasonTemperature = seasonTemperature;
    }

    public double getSeasonMinTemperature() {
        return seasonMinTemperature;
    }

    public void setSeasonMinTemperature(double seasonMinTemperature) {
        this.seasonMinTemperature = seasonMinTemperature;
    }

    public double getSeasonMaxTemperature() {
        return seasonMaxTemperature;
    }

    public void setSeasonMaxTemperature(double seasonMaxTemperature) {
        this.seasonMaxTemperature = seasonMaxTemperature;
    }
}
