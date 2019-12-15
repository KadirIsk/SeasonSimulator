package entity.baseEntity.animal;

import entity.foods.SeaAnimalsFood;
import enumTypes.Environment;

public abstract class SeaAnimal extends Animal {

    protected Environment environment = Environment.SEA;

    protected abstract void feed(SeaAnimalsFood seaAnimalsFood);
    protected abstract void died(SeaAnimalsFood seaAnimalsFood);
}
