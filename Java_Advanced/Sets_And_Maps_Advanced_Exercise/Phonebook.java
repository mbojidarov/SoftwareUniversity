import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phoneBook = new LinkedHashMap<>();

        String[] input = scanner.nextLine().split("-");

        while (!"search".equals(input[0])){
            phoneBook.put(input[0], input[1]);

           input = scanner.nextLine().split("-");
        }
        input = scanner.nextLine().split("-");
        while (!"stop".equals(input[0])){
            String name = input[0];
            if (phoneBook.containsKey(name)){
                System.out.println(String.format("%s -> %s", name, phoneBook.get(name)));
            }else{
                System.out.println(String.format("Contact %s does not exist.", name));
            }

            input = scanner.nextLine().split("-");
        }
    }
}
