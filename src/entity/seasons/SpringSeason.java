package entity.seasons;

import entity.TemperatureCondition;
import entity.baseEntity.animal.Animal;
import entity.baseEntity.season.Season;
import entity.baseEntity.food.Food;
import enumTypes.Environment;
import enumTypes.SeasonType;
import services.Utility;

import java.util.List;

public class SpringSeason extends Season {

    private SeasonType seasonName = SeasonType.SPRING;

    public SpringSeason(){
        seasonLength = 90;
        landTemperatureCondition = new TemperatureCondition();
        seaTemperatureCondition = new TemperatureCondition();
        skyTemperatureCondition = new TemperatureCondition();
    }

    @Override
    public void simulateSeason(List<Animal> animals, List<Food> foods) {

    }

    public SeasonType getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(SeasonType seasonName) {
        this.seasonName = seasonName;
    }

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

    @Override
    public void printInfo() {
        Utility.printSeasonInfo("",
                Integer.toString(seasonLength),
                Environment.LAND.getEnvironment(),
                landTemperatureCondition,
                false);

        Utility.printSeasonInfo(seasonName.getSeason(),
                Integer.toString(seasonLength),
                Environment.SEA.getEnvironment(),
                seaTemperatureCondition,
                false);

        Utility.printSeasonInfo("",
                Integer.toString(seasonLength),
                Environment.SKY.getEnvironment(),
                skyTemperatureCondition,
                true);
    }
}
