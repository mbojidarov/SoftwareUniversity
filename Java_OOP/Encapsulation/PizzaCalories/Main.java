package PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pizza pizza;
        Dough dough;
        Topping topping;

        String[] pizzaInput = scanner.nextLine().split("\\s+");
        try {
            pizza = new Pizza(pizzaInput[1], Integer.parseInt(pizzaInput[2]));
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            return;
        }
        String[] doughInput = scanner.nextLine().split("\\s+");
        try {
            dough = new Dough(
                    doughInput[1], doughInput[2], Double.parseDouble(doughInput[3]));
            pizza.setDough(dough);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            return;
        }
        String[] toppingInput = scanner.nextLine().split("\\s+");
        while (!toppingInput[0].equals("END")) {

            try {
                topping = new Topping(toppingInput[1], Double.parseDouble(toppingInput[2]));
                pizza.addToppings(topping);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                return;
            }

            toppingInput = scanner.nextLine().split("\\s+");
        }
        System.out.println(pizza.toString());
    }
}
