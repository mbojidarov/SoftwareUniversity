package Constructors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Car car;

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            if (input.length == 1){
                car = new Car(input[0]);


            }else if (input.length == 2){
                car = new Car(input[0], Integer.parseInt(input[1]));

            }else{ // lenght == 3
                car = new Car(input[0], input[1], Integer.parseInt(input[2]));
                car.setBrand(input[0]);
                car.setModel(input[1]);
                car.setHorsePower(Integer.parseInt(input[2]));
            }
            System.out.println(car.toString());
        }
    }
}
