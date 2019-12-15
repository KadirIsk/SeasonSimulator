package entity.baseEntity.season;

import entity.TemperatureCondition;
import interfaces.ISeason;

public abstract class Season implements ISeason {

    protected int seasonLength;
    protected TemperatureCondition landTemperatureCondition;
    protected TemperatureCondition seaTemperatureCondition;
    protected TemperatureCondition skyTemperatureCondition;

    public int getSeasonLength() {
        return seasonLength;
    }

    public void setSeasonLength(int seasonLength) {
        this.seasonLength = seasonLength;
    }

    public TemperatureCondition getLandTemperatureCondition() {
        return landTemperatureCondition;
    }

    public void setLandTemperatureCondition(TemperatureCondition landTemperatureCondition) {
        this.landTemperatureCondition = landTemperatureCondition;
    }

    public TemperatureCondition getSeaTemperatureCondition() {
        return seaTemperatureCondition;
    }

    public void setSeaTemperatureCondition(TemperatureCondition seaTemperatureCondition) {
        this.seaTemperatureCondition = seaTemperatureCondition;
    }

    public TemperatureCondition getSkyTemperatureCondition() {
        return skyTemperatureCondition;
    }

    public void setSkyTemperatureCondition(TemperatureCondition skyTemperatureCondition) {
        this.skyTemperatureCondition = skyTemperatureCondition;
    }
}
