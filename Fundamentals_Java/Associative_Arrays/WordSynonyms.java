import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> synonymsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String wordKey = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (synonymsMap.containsKey(wordKey)) {
                List<String> synonymsList = synonymsMap.get(wordKey);
                synonymsList.add(synonym);

                synonymsMap.put(wordKey, synonymsList);
            } else {
                List<String> synonymList2 = new ArrayList<>();
                synonymList2.add(synonym);

                synonymsMap.put(wordKey, synonymList2);
            }
        }
        for (Map.Entry<String, List<String>> entry : synonymsMap.entrySet()) {

            System.out.printf("%s - %s%n", entry.getKey(),
                    entry.getValue()
            .toString().replaceAll("[\\[\\]]", ""));
        }
    }
}
