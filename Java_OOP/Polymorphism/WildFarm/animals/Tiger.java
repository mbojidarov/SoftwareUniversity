package WildFarm.animals;

import WildFarm.Foods.Food;
import WildFarm.Foods.Meat;
import WildFarm.Foods.Vegetable;

public class Tiger extends Felime{
    public Tiger(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void eatFood(Food food) {
//        if (food.getClass() == Meat.class)
        if (food instanceof Vegetable){ //типова проверка
            throw new IllegalArgumentException("Tigers are not eating that type of food!");
        }
        super.eatFood(food);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }
}
