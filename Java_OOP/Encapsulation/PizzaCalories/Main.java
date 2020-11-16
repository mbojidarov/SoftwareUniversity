package PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String[] pizzaInput = scanner.nextLine().split("\\s+");

               Pizza pizza = new Pizza(pizzaInput[1], Integer.parseInt(pizzaInput[2]));

            String[] doughInput = scanner.nextLine().split("\\s+");

               Dough dough = new Dough(doughInput[1], doughInput[2], Double.parseDouble(doughInput[3]));
                pizza.setDough(dough);

            String[] toppingInput = scanner.nextLine().split("\\s+");

            while (!toppingInput[0].equals("END")) {

                  Topping  topping = new Topping(toppingInput[1], Double.parseDouble(toppingInput[2]));
                    pizza.addTopping(topping);

                toppingInput = scanner.nextLine().split("\\s+");
            }
            System.out.println(pizza.toString());

        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
}
