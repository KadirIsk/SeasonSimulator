package entity.foods;

import entity.baseEntity.food.Food;
import enumTypes.Environment;

public class SeaAnimalsFood extends Food {
    Environment environment = Environment.SEA;

    public Environment getEnvironment() {
        return environment;
    }
}
