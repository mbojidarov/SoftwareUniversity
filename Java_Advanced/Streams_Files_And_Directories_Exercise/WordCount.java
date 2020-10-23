import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WordCount {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Path pathFile = Path.of("C:\\Users\\Public\\Java_Advanced\\Streams_Files_And_Directories_Exercise\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt");

        List<String> lines = Files.readAllLines(pathFile);

        Map<String, Integer> wordsCount = new LinkedHashMap<>();

        for (String line : lines) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                wordsCount.put(word, 0);
            }
        }
        Path searchFile = Path.of("C:\\Users\\Public\\Java_Advanced\\Streams_Files_And_Directories_Exercise\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt");
        List<String> searchedLines = Files.readAllLines(searchFile);

        for (String line : searchedLines) {
            Arrays.stream(line.split("\\s+")).forEach(word -> {
                if (wordsCount.containsKey(word)){
                    wordsCount.put(word, wordsCount.get(word) + 1);
                }
            });
        }
        File outputFile = new File("C:\\Users\\Public\\Java_Advanced\\Streams_Files_And_Directories_Exercise\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\resultsWords.txt");
        PrintWriter writer = new PrintWriter(outputFile);
        for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {
        writer.println(entry.getKey() + " - " + entry.getValue());
        }
        writer.close();
    }
}
