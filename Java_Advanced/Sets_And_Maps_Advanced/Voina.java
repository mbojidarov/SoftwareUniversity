import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<Integer> firstPlayerDeque = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)    // IntStream --> primitive int
                .boxed()                  // Stream<Integer> --> wrapper Integer class (object)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        LinkedHashSet<Integer> secondPlayerDeque = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));


        for (int i = 0; i < 50; i++) {

            int firstPlayerCard = getFirstCard(firstPlayerDeque);
            int secondPlayerCard = getFirstCard(secondPlayerDeque);

            if (firstPlayerCard > secondPlayerCard) {
                firstPlayerDeque.add(firstPlayerCard);  // .addAll(Array.aslist(firstPlayerCard, secondPlayerCard))
                firstPlayerDeque.add(secondPlayerCard);
            } else {
                secondPlayerDeque.add(firstPlayerCard);
                secondPlayerDeque.add(secondPlayerCard);
            }

            if (firstPlayerDeque.isEmpty() || secondPlayerDeque.isEmpty()) {
                break;
            }

        }

        if (firstPlayerDeque.size() > secondPlayerDeque.size()) {
            System.out.println("First player win!");
        } else if (secondPlayerDeque.size() > firstPlayerDeque.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }

    private static int getFirstCard(LinkedHashSet<Integer> playerCardsDeque) {
//        for (Integer card : playerCardsDeque) {
//            int topCard = card;
//            break;
//        }
        int topCard = playerCardsDeque.iterator().next();
        playerCardsDeque.remove(topCard);

        return topCard;
    }
}
