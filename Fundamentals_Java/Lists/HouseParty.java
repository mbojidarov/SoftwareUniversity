import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guests = new ArrayList<>();
        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < input; i++) {
            String[] person = scanner.nextLine().split("\\s+", 2);
            String name = person[0];

            if (guests.contains(name) && "is going!".equals(person[1])){
                System.out.printf("%s is already in the list!%n", name);

            }else if (!(guests.contains(name)) && "is going!".equals(person[1])){
                guests.add(name);

            }else if (guests.contains(name) && "is not going!".equals(person[1])){
                guests.remove(name);

            }else if (!(guests.contains(name)) && "is not going!".equals(person[1])){
                System.out.printf("%s is not in the list!%n", name);
            }
        }
        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}
