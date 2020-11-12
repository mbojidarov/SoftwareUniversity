package FirstAndReserveTeam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int n = Integer.parseInt(scanner.nextLine());
//        List<Person> listNames = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            String[] input = scanner.nextLine().split("\\s+");
//
//            try {
//                Person person = new Person(input[0], input[1],
//                        Integer.parseInt(input[2]), Double.parseDouble(input[3]));
//                listNames.add(person);
//
//            } catch (IllegalArgumentException ex) {
//                System.out.println(ex.getMessage());
//            }
//        }
//        for (Person person : listNames) {
//            System.out.println(person.toString());
//        }

        Team team = new Team("Black Eagles");

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            Person person = new Person(input[0], input[1],
                    Integer.parseInt(input[2]), Double.parseDouble(input[3]));

            team.addPlayer(person);
        }
        System.out.println("First team have " + team.getFirstTeam().size() + " players");
        System.out.println("Reserve team have " + team.getReserveTeam().size() + " players");
    }
}
