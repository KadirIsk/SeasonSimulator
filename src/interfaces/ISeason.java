package interfaces;

import entity.baseEntity.animal.Animal;
import entity.baseEntity.food.Food;

import java.util.List;

public interface ISeason {
    void simulateSeason(List<Animal> animals, List<Food> foods);
    void printInfo();
}
