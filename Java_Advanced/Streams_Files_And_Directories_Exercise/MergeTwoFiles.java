import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Path pathFileOne = Path.of("C:\\Users\\Public\\Java_Advanced\\Streams_Files_And_Directories_Exercise\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt");
        Path pathFileTwo = Path.of("C:\\Users\\Public\\Java_Advanced\\Streams_Files_And_Directories_Exercise\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt");

        List<String> linesOne = Files.readAllLines(pathFileOne);
        List<String> linesTwo = Files.readAllLines(pathFileTwo);

        File outputFile = new File("C:\\Users\\Public\\Java_Advanced\\Streams_Files_And_Directories_Exercise\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\mergeOutput.txt");
        PrintWriter writer = new PrintWriter(outputFile);

        linesOne.forEach(line -> writer.println(line)); //(writer::printline)
        linesTwo.forEach(writer::println);              //(writer::printline)

        writer.close();
    }
}
