package interfaces;

import entity.baseEntity.food.Food;

public interface IAnimal {
    void simulateDay(int day, double temperature, Food food);
    void printInfo(int index);
}
