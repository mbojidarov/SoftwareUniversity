package OrderByAge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<OnePerson> people = new ArrayList<>();

        String input = scanner.nextLine();
        while (!"End".equals(input)){
            String[] parts = input.split("\\s+");
            String name = parts[0];
            String id = parts[1];
            int age = Integer.parseInt(parts[2]);

            OnePerson onePerson = new OnePerson(name, id, age);
            people.add(onePerson);

            input = scanner.nextLine();
        }
        people
                .stream()
                .sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()))
                .forEach(p -> System.out.println(p));
    }
}
