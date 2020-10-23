import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class SumBytes {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Path pathFile = Path.of("C:\\Users\\Public\\Java_Advanced\\Streams_Files_And_Directories_Exercise\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");

        long sum = 0;
        byte[] values = Files.readAllBytes(pathFile);
        for (byte value : values) {
            if (value == 10 || value == 13){
                continue;
            }
            sum += value;
        }
        System.out.println(sum);
    }
}
