package entity.foods;

import entity.baseEntity.food.Food;
import enumTypes.Environment;

public class SkyAnimalsFood extends Food {
    Environment environment = Environment.SKY;

    public Environment getEnvironment() {
        return environment;
    }
}
