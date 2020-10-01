import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double studioPriceTotal = 0;
        double apartPriceTotal = 0;

        switch (month) {
            case "May":
            case "October":
                if (nights <= 7) {
                    studioPriceTotal = nights * 50;
                    apartPriceTotal = nights * 65;
                } else if (nights <= 14) {
                    studioPriceTotal = nights * 50 * 0.95;
                    apartPriceTotal = nights * 65;
                } else {
                    studioPriceTotal = nights * 50 * 0.70;
                    apartPriceTotal = nights * 65 * 0.90;
                }
                break;
            case "June":
            case "September":
                if (nights <= 14){
                    studioPriceTotal = nights * 75.20;
                    apartPriceTotal = nights * 68.70;
                }else{
                    studioPriceTotal = nights * 75.20 * 0.80;
                    apartPriceTotal = nights * 68.70 * 0.90;
                }
                break;
            case "July":
            case "August":
                if (nights <= 14){
                    studioPriceTotal = nights * 76;
                    apartPriceTotal = nights * 77;
                } else {
                    studioPriceTotal = nights * 76;
                    apartPriceTotal = nights * 77 * 0.90;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.", apartPriceTotal);
        System.out.printf("%nStudio: %.2f lv.", studioPriceTotal);

    }
}
