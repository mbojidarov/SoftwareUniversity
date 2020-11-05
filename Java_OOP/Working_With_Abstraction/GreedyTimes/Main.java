package GreedyTimes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long capacityBag = Long.parseLong(scanner.nextLine());
        String[] parts = scanner.nextLine().split("\\s+");

        Bag bag = new Bag(capacityBag);

        for (int i = 0; i < parts.length; i += 2) {
            String itemName = parts[i];
            long quantity = Long.parseLong(parts[i + 1]);

            if (itemName.length() == 3) {       //category = "Cash";

                bag.addCash(itemName, quantity);

            } else if (itemName.toLowerCase().endsWith("gem")) { //category = "Gem";

                bag.addGem(itemName, quantity);

            } else if (itemName.toLowerCase().equals("gold")) {  //category = "Gold";

                bag.addGold(quantity);

            }
        }
        System.out.println(bag.toString());
    }
}