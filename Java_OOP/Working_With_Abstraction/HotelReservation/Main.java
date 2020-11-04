package HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        double pricePerDay = Double.parseDouble(input[0]);
        int numberOfDays = Integer.parseInt(input[1]);
        String inputSeason = input[2];
        String inputDiscount = input[3];

        Season season = Season.valueOf(inputSeason.toUpperCase());
        Discount discountType = Discount.valueOf(inputDiscount.toUpperCase());

        PriceCalculator calc = new PriceCalculator
                (season, discountType, pricePerDay, numberOfDays);

        System.out.printf("%.2f%n",calc.calculatePrice());
    }
}
