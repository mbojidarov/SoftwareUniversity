package OpinionPoll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String peopleName = input[0];
            int peopleAge = Integer.parseInt(input[1]);
           // person = new Person(input[0], Integer.parseInt(input[1]));

            Person person = new Person(peopleName, peopleAge);
            if (peopleAge > 30){
                people.add(person);
            }
        }
        people.sort(Comparator.comparing(p -> p.getName()));

        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}
