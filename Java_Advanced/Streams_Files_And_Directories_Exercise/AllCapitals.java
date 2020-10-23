import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class AllCapitals {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Path pathFile = Path.of("C:\\Users\\Public\\Java_Advanced\\Streams_Files_And_Directories_Exercise\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");
        //Path outputPathFile = Path.of("C:\\Users\\Public\\Java_Advanced\\Streams_Files_And_Directories_Exercise\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt");

        List<String> lines = Files.readAllLines(pathFile);

        File outputFile = new File("C:\\Users\\Public\\Java_Advanced\\Streams_Files_And_Directories_Exercise\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt");
        PrintWriter writer = new PrintWriter(outputFile);
//        lines.forEach(line -> System.out.println(line.toUpperCase()));
        lines.forEach(line -> writer.println(line.toUpperCase()));
        writer.close();
    }
}
