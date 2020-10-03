import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] inputFile = scanner.nextLine().split("\\\\");
        String fullFileName = inputFile[inputFile.length-1];

        String fileName = fullFileName.substring(0, fullFileName.indexOf('.'));
        String extension = fullFileName.substring(fullFileName.indexOf('.') + 1,
                fullFileName.length());

        System.out.printf("File name: %s%n", fileName);
        System.out.printf("File extension: %s", extension);
    }
}
