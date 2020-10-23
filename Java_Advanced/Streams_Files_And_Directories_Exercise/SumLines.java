import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class SumLines {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Path pathFile = Path.of("C:\\Users\\Public\\Java_Advanced\\Streams_Files_And_Directories_Exercise\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");

        List<String> lines = Files.readAllLines(pathFile);
        lines.stream().map(String::toCharArray).forEach(charArray ->{
            int sum = 0;
            for (char symbol : charArray) {
                sum += symbol;
            }
            System.out.println(sum);
        });
    }
}
