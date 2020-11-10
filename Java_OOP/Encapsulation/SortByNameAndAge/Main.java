package SortByNameAndAge;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

int n = Integer.parseInt(scanner.nextLine());
        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            personList.add(new Person(input[0], input[1], Integer.parseInt(input[2])));
        }

        personList.stream().sorted((p1, p2) -> {
            int result = p1.getFirstName().compareTo(p2.getFirstName());
            if (result != 0){
                return result;
            }else{
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        }).forEach(p1 -> System.out.println(p1.toString()));

//        Collections.sort(personList, (p1, p2) -> {
//            int result = p1.getFirstName().compareTo(p2.getFirstName());
//            if (result != 0){
//                return result;
//            }else {
//                return Integer.compare(p1.getAge(), p2.getAge());
//            }
//        });
//        for (Person person : personList) {
//            System.out.println(person);
//        }
    }
}
