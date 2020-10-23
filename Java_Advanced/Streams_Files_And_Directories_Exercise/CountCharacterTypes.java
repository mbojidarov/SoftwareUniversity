import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String pathFile = "C:\\Users\\Public\\Java_Advanced\\Streams_Files_And_Directories_Exercise\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        int countVowels = 0;
        int countConsonants = 0;
        int countPunctuation = 0;
        String vowels = "aeiou";
        String punctuation = "!,.?";

        BufferedReader reader = new BufferedReader(new FileReader(pathFile));

        String line = reader.readLine();

        while (line != null){
            String[] words = line.split("\\s+");
            for (String word : words) {
                for (char symbol : word.toCharArray()) {
                    if (vowels.contains(String.valueOf(symbol))){
                        countVowels++;
                    }else if (punctuation.contains(String.valueOf(symbol))){
                        countPunctuation++;
                    }else{
                        countConsonants++;
                    }
                }
            }
            line = reader.readLine();
        }
        reader.close();

        File outputFile = new File("C:\\Users\\Public\\Java_Advanced\\Streams_Files_And_Directories_Exercise\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\outputCount.txt");
        PrintWriter writer = new PrintWriter(outputFile);
        writer.println("Vowels: " + countVowels);
        writer.println("Consonants: " + countConsonants);
        writer.println("Punctuation: " + countPunctuation);
        writer.close();
    }
}
