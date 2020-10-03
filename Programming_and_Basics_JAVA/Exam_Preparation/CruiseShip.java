import java.util.Scanner;

public class CruiseShip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cruise = scanner.nextLine();
        String cabin = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if ("Mediterranean".equals(cruise)){
            switch (cabin){
                case "standard cabin":
                    price = 4 * 27.50 * nights;
                    break;
                case "cabin with balcony":
                    price = 4 * 30.20 * nights;
                    break;
                case "apartment":
                    price = 4 * 40.50 * nights;
                    break;
            }

        }else if ("Adriatic".equals(cruise)){
            switch (cabin){
                case "standard cabin":
                    price = 4 * 22.99 * nights;
                    break;
                case "cabin with balcony":
                    price = 4 * 25.00 * nights;
                    break;
                case "apartment":
                    price = 4 * 34.99 * nights;
                    break;
            }

        }else if ("Aegean".equals(cruise)){
            switch (cabin){
                case "standard cabin":
                    price = 4 * 23.00 * nights;
                    break;
                case "cabin with balcony":
                    price = 4 * 26.60 * nights;
                    break;
                case "apartment":
                    price = 4 * 39.80 * nights;
                    break;
            }
        }
        double totalPrice = 0;
        if (nights > 7){
            totalPrice = price * 0.75;
        }else{
            totalPrice = price;
        }
        System.out.printf("Annie's holiday in the %s sea costs %.2f lv.", cruise, totalPrice);
    }
}
