package entity.baseEntity.animal;

import entity.foods.SkyAnimalsFood;
import enumTypes.Environment;

public abstract class SkyAnimal extends Animal {

    protected Environment environment = Environment.SKY;

    protected abstract void feed(SkyAnimalsFood skyAnimalsFood);
    protected abstract void died(SkyAnimalsFood skyAnimalsFood);
}
