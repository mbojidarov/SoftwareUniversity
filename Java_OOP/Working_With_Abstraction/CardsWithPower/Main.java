package CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cardRank = scanner.nextLine();
        String cardSuit = scanner.nextLine();

        Powers cardPower = new Powers(Card.valueOf(cardRank), Suit.valueOf(cardSuit));

        System.out.println(cardPower);




//        System.out.printf("Card name: %s of %s; " + "Card power: %d%n"
//                , cardRank, cardSuit, calculateCardPower(cardRank, cardSuit));
    }

//    private static int calculateCardPower(String card, String suit) {
//        int powerCurrentCard = Card.valueOf(card).getPower();
//        int powerCurrentSuit = Suit.valueOf(suit).getPower();
//        return powerCurrentCard + powerCurrentSuit;
//    }
}
