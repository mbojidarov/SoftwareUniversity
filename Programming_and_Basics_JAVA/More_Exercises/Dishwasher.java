import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottles = Integer.parseInt(scanner.nextLine());
        int detergentMl = bottles * 750;
        int counter = 0;
        int platesTotal = 0;
        int tendjeraTotal = 0;
        boolean noLiquid = false;

        String input = scanner.nextLine();
        while (!"End".equals(input)){
            int dishes = Integer.parseInt(input);
            counter++;
            if (counter <= 2){
                platesTotal = platesTotal + dishes;
                detergentMl = detergentMl - dishes * 5;
            } else {
                tendjeraTotal = tendjeraTotal + dishes;
                detergentMl = detergentMl - dishes * 15;
                counter = 0;
            }
            if (detergentMl < 0){
                noLiquid = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (noLiquid){
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(detergentMl));
        } else {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", platesTotal, tendjeraTotal);
            System.out.printf("Leftover detergent %d ml.", detergentMl);
        }
    }
}
