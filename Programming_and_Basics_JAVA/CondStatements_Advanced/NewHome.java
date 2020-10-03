import java.util.Scanner;

public class NewHome {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        String flowers = scanner.nextLine();
        int numFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double discount = 0;

        switch (flowers){
            case "Roses":
                price = 5;
                if (numFlowers <= 80){
                    discount = numFlowers * price;
                }else{
                    discount = numFlowers * price * 0.9;
                }
                break;
            case "Dahlias":
                price = 3.80;
                if (numFlowers <= 90){
                    discount = numFlowers * price;
                }else {
                    discount = numFlowers * price * 0.85;
                }
                break;
            case "Tulips":
                price = 2.80;
                if (numFlowers <= 80) {
                    discount = numFlowers * price;
                }else {
                    discount = numFlowers * price * 0.85;
                }
                break;
            case "Narcissus":
                price = 3;
                if (numFlowers >= 120){
                    discount = numFlowers * price;
                }else {
                    discount = numFlowers * price * 1.15;
                }
                break;
            case "Gladiolus":
                price = 2.50;
                if (numFlowers >= 80){
                    discount = numFlowers * price;
                }else{
                    discount = numFlowers * price * 1.2;
                }
                break;
        }
        if (budget >= discount){
            double moneyLeft = budget - discount;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",
                    numFlowers, flowers, moneyLeft);
        }else {
            double moneyNeed = discount - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", moneyNeed);
        }
    }
}
