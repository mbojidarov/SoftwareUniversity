import java.util.*;

public class OddOccuurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        Map<String, Integer> wordsCount = new LinkedHashMap<>();

        for (String part : input) {
            String currentWord = part.toLowerCase();
            if (wordsCount.containsKey(currentWord)){
                wordsCount.put(currentWord, wordsCount.get(currentWord) + 1);
            }else{
                wordsCount.put(currentWord, 1);
            }
        }
        List<String> oddWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {
            if(entry.getValue() % 2 != 0){
                oddWords.add(entry.getKey());
            }
        }
        System.out.printf("%s",
                oddWords.toString().replaceAll("[\\[\\]]", ""));
    }
}
