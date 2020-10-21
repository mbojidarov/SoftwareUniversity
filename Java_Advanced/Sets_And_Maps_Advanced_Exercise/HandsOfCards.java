import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Set<String>> playerCards = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!"JOKER".equals(input)){
            String playerName = input.split(": ")[0];
            String parts = input.split(": ")[1];
            String[] cards = parts.split(", ");

            playerCards.putIfAbsent(playerName, new HashSet<>());
            playerCards.get(playerName).addAll(Arrays.asList(cards));

            input = scanner.nextLine();
        }
//        for (Map.Entry<String, Set<String>> entry : playerCards.entrySet()) {
//            System.out.println(entry.getKey() +": "+ calcCardsScore(entry.getValue()));
//        }
        playerCards.forEach((name, score) ->
                System.out.println(name + ": " + calcCardsScore(score)));

    }

    private static int calcCardsScore(Set<String> cards) {
        Map<String, Integer> calc = new LinkedHashMap<>();
        calc.put("A", 14);
        calc.put("K", 13);
        calc.put("Q", 12);
        calc.put("J", 11);
        calc.put("1", 10);
        calc.put("2", 2);
        calc.put("3", 3);
        calc.put("4", 4);
        calc.put("5", 5);
        calc.put("6", 6);
        calc.put("7", 7);
        calc.put("8", 8);
        calc.put("9", 9);
        calc.put("C", 1);
        calc.put("D", 2);
        calc.put("H", 3);
        calc.put("S", 4);

        int totalScore = 0;
        for (String card : cards) {
            char power = card.charAt(0);
            char type = card.charAt(card.length() - 1);
            totalScore += calc.get("" + power) * calc.get("" + type);
        }
        return totalScore;
    }
}
