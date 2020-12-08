package WildFarm.animals;

import WildFarm.Foods.Food;
import WildFarm.Foods.Meat;

public class Mouse extends Mammal{
    public Mouse(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void eatFood(Food food) {
//        if (food.getClass() == Meat.class)
        if (food instanceof Meat){ //типова проверка
            throw new IllegalArgumentException("Mice are not eating that type of food!");
        }
        super.eatFood(food);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }
}
