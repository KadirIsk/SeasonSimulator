package entity.baseEntity.animal;

import entity.foods.LandAnimalsFood;
import enumTypes.Environment;

public abstract class LandAnimal extends Animal {

    protected Environment livingEnvironment = Environment.LAND;

    protected abstract void feed(LandAnimalsFood landAnimalsFood);
    protected abstract void died(LandAnimalsFood landAnimalsFood);
}
