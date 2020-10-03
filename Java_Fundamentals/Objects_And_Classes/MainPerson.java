import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainPerson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split("\\s+");
            String name = parts[0];
            int age = Integer.parseInt(parts[1]);

            Person person = new Person(name, age);
            if (person.getAge() > 30){
                people.add(person);
            }
        }
        people.stream()
                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .forEach(p -> System.out.println(p.getName() + " - " + p.getAge()));
    }
}
