import java.io.File;
import java.nio.file.Path;
import java.util.Scanner;

public class GetFolderSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pathDirectory = "C:\\Users\\Public\\Java_Advanced\\Streams_Files_And_Directories_Exercise\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";

        File folder = new File(pathDirectory);

        long size = 0;
        if (folder.listFiles() != null){
            for (File file : folder.listFiles()) {
                if (file.listFiles() != null){

                }
                size += file.length();
            }
        }
        System.out.println("Folder size: " + size);
    }
}
