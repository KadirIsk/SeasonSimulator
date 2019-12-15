package entity.foods;

import entity.baseEntity.food.Food;
import enumTypes.Environment;

public class LandAnimalsFood extends Food {
    Environment environment = Environment.LAND;

    public Environment getEnvironment() {
        return environment;
    }
}
