package entity.animals;

import entity.baseEntity.animal.LandAnimal;
import entity.baseEntity.food.Food;
import entity.foods.LandAnimalsFood;
import enumTypes.AnimalGenus;
import enumTypes.Environment;
import enumTypes.Period;

import static services.Utility.printAnimalInfo;

public class Human extends LandAnimal {

    public Human(){
        bodyWeight = 0;
        animalGenus = AnimalGenus.HUMAN;
        feedingPeriod = Period.ONE_DAY;
        isDiseased = true;
    }

    public Environment getLivingEnvironment(){
        return this.livingEnvironment;
    }

    @Override
    public void simulateDay(int day, double temperature, Food food) {

    }

    @Override
    protected void feed(LandAnimalsFood landAnimalsFood) {

    }

    @Override
    protected void died(LandAnimalsFood landAnimalsFood) {

    }

    @Override
    public void printInfo(int index) {
        printAnimalInfo(Integer.toString(index),
                animalGenus.getAnimalGenus(),
                Double.toString(bodyWeight),
                feedingPeriod.getPeriod(),
                isDiseased ? "Hasta" : "Saglikli");
    }
}
