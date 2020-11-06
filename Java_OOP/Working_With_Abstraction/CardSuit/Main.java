package CardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Card Suits:");
        for (CardSuit Enums : CardSuit.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", Enums.ordinal(), Enums);

        }
    }
}
