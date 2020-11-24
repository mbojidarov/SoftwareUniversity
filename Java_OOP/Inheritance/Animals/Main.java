package Animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

String input = scanner.nextLine();
        while (!"Beast!".equals(input)){
            String animalType = input;
            String[] parts = scanner.nextLine().split("\\s+");
            String name = parts[0];
            int age = Integer.parseInt(parts[1]);
            String gender = parts[2];

            try {
                Animal animal;
                if ("Dog".equals(animalType)){
                    animal = new Dog(name, age, gender);
                }else if ("Frog".equals(animalType)){
                    animal = new Frog(name, age, gender);
                }else if ("Cat".equals(animalType)){
                    animal = new Cat(name, age, gender);
                }else if ("Kitten".equals(animalType)){
                    animal = new Kitten(name, age);
                }else {
                    animal = new Tomcat(name, age);
                }
                System.out.println(animal.toString());

            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
            input = scanner.nextLine();
        }
    }
}
