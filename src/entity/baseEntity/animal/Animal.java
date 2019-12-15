package entity.baseEntity.animal;

import enumTypes.AnimalGenus;
import enumTypes.Period;
import interfaces.IAnimal;

public abstract class Animal implements IAnimal {
    protected Period feedingPeriod;
    protected AnimalGenus animalGenus;
    protected double feedingPercent;
    protected double starvationPercent;
    protected double activityPercent;
    protected double firstPartActivityProbability;
    protected double diseasePercent;
    protected double diseaseIncreasePercent;
    protected double diseaseDecreasePercent;
    protected double totalDiseaseIncreaseDueToTemperature;
    protected double totalDiseaseIncreaseDueToStarvation;
    protected int starvationAmount;
    protected int maxStarvationPeriod;
    protected double bodyWeight;
    protected double recyclingPercentAfterDeath;
    protected int temperatureToleranceValue;
    protected double bodyTemperature;
    protected boolean isDiseased;
    protected int lastFeedingDay;

    public AnimalGenus getAnimalGenus() {
        return animalGenus;
    }

    public void setAnimalGenus(AnimalGenus animalGenus) {
        this.animalGenus = animalGenus;
    }

    public double getStarvationPercent() {
        return starvationPercent;
    }

    public void setStarvationPercent(double starvationPercent) {
        this.starvationPercent = starvationPercent;
    }

    public Period getFeedingPeriod() {
        return feedingPeriod;
    }

    public void setFeedingPeriod(Period feedingPeriod) {
        this.feedingPeriod = feedingPeriod;
    }

    public double getFeedingPercent() {
        return feedingPercent;
    }

    public void setFeedingPercent(double feedingPercent) {
        this.feedingPercent = feedingPercent;
    }

    public double getActivityPercent() {
        return activityPercent;
    }

    public void setActivityPercent(double activityPercent) {
        this.activityPercent = activityPercent;
    }

    public double getFirstPartActivityProbability() {
        return firstPartActivityProbability;
    }

    public void setFirstPartActivityProbability(double firstPartActivityProbability) {
        this.firstPartActivityProbability = firstPartActivityProbability;
    }

    public double getDiseasePercent() {
        return diseasePercent;
    }

    public void setDiseasePercent(double diseasePercent) {
        this.diseasePercent = diseasePercent;
    }

    public double getDiseaseIncreasePercent() {
        return diseaseIncreasePercent;
    }

    public void setDiseaseIncreasePercent(double diseaseIncreasePercent) {
        this.diseaseIncreasePercent = diseaseIncreasePercent;
    }

    public double getDiseaseDecreasePercent() {
        return diseaseDecreasePercent;
    }

    public void setDiseaseDecreasePercent(double diseaseDecreasePercent) {
        this.diseaseDecreasePercent = diseaseDecreasePercent;
    }

    public double getTotalDiseaseIncreaseDueToTemperature() {
        return totalDiseaseIncreaseDueToTemperature;
    }

    public void setTotalDiseaseIncreaseDueToTemperature(double totalDiseaseIncreaseDueToTemperature) {
        this.totalDiseaseIncreaseDueToTemperature = totalDiseaseIncreaseDueToTemperature;
    }

    public double getTotalDiseaseIncreaseDueToStarvation() {
        return totalDiseaseIncreaseDueToStarvation;
    }

    public void setTotalDiseaseIncreaseDueToStarvation(double totalDiseaseIncreaseDueToStarvation) {
        this.totalDiseaseIncreaseDueToStarvation = totalDiseaseIncreaseDueToStarvation;
    }

    public int getStarvationAmount() {
        return starvationAmount;
    }

    public void setStarvationAmount(int starvationAmount) {
        this.starvationAmount = starvationAmount;
    }

    public int getMaxStarvationPeriod() {
        return maxStarvationPeriod;
    }

    public void setMaxStarvationPeriod(int maxStarvationPeriod) {
        this.maxStarvationPeriod = maxStarvationPeriod;
    }

    public double getBodyWeight() {
        return bodyWeight;
    }

    public void setBodyWeight(double bodyWeight) {
        this.bodyWeight = bodyWeight;
    }

    public double getRecyclingPercentAfterDeath() {
        return recyclingPercentAfterDeath;
    }

    public void setRecyclingPercentAfterDeath(double recyclingPercentAfterDeath) {
        this.recyclingPercentAfterDeath = recyclingPercentAfterDeath;
    }

    public int getTemperatureToleranceValue() {
        return temperatureToleranceValue;
    }

    public void setTemperatureToleranceValue(int temperatureToleranceValue) {
        this.temperatureToleranceValue = temperatureToleranceValue;
    }

    public double getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(double bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    public boolean isDiseased() {
        return isDiseased;
    }

    public void setDiseased(boolean diseased) {
        isDiseased = diseased;
    }

    public int getLastFeedingDay() {
        return lastFeedingDay;
    }

    public void setLastFeedingDay(int lastFeedingDay) {
        this.lastFeedingDay = lastFeedingDay;
    }
}
