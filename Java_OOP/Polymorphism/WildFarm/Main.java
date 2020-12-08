package WildFarm;

import WildFarm.Foods.Food;
import WildFarm.Foods.Meat;
import WildFarm.Foods.Vegetable;
import WildFarm.animals.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Animal> animalsList = new ArrayList<>();

        String[] firstInput = scanner.nextLine().split("\\s+");

        while (!"End".equals(firstInput[0])){

            Animal animal = createAnimal(firstInput);

            String[] secondInput = scanner.nextLine().split("\\s+");

            Food food = createFood(secondInput);

            animal.makeSound();

            try {
                animal.eatFood(food);
            }catch (IllegalArgumentException exception){
                System.out.println(exception.getMessage());
            }
            animalsList.add(animal);

            firstInput = scanner.nextLine().split("\\s+");
        }
        for (Animal animal : animalsList) {
            System.out.println(animal.toString());
        }
    }

    private static Food createFood(String[] secondInput) {
        int foodQuantity = Integer.parseInt(secondInput[1]);

        return "Meat".equals(secondInput[0])
                ? new Meat(foodQuantity)
                : new Vegetable(foodQuantity);
    }

    private static Animal createAnimal(String [] firstInput) {
        switch (firstInput[0]){
            case "Mouse":
                return new Mouse(firstInput[1], "Mouse",
                        Double.parseDouble(firstInput[2]), firstInput[3]);
            case "Zebra":
                return new Zebra(firstInput[1], "Zebra",
                        Double.parseDouble(firstInput[2]), firstInput[3]);
            case "Cat":
                return new Cat(firstInput[1], "Cat",
                        Double.parseDouble(firstInput[2]), firstInput[3], firstInput[4]);
            case "Tiger":
                return new Tiger(firstInput[1], "Tiger",
                        Double.parseDouble(firstInput[2]), firstInput[3]);
            default:
                throw new IllegalArgumentException("Unknown animal type" + firstInput[0]);
        }
    }
}
