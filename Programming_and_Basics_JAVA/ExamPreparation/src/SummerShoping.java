import java.util.Scanner;

public class SummerShoping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        double towelPrice = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double umbrellaPrice = towelPrice * 2 / 3;
        double flipflopsPrice = umbrellaPrice * 0.75;
        double bagPrice = (towelPrice + flipflopsPrice) / 3;

        double totalDiscount = (towelPrice + umbrellaPrice + flipflopsPrice + bagPrice) * discount / 100;
        double totalPrice = (towelPrice + umbrellaPrice + flipflopsPrice + bagPrice) - totalDiscount;
        double diff = Math.abs(budget - totalPrice);

        if (budget >= totalPrice){
            System.out.printf("Annie's sum is %.2f lv. She has %.2f lv. left.%n", totalPrice, diff);
        }else{
            System.out.printf("Annie's sum is %.2f lv. She needs %.2f lv. more.", totalPrice, diff);
        }


    }
}
