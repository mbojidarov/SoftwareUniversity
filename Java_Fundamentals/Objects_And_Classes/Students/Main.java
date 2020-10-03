package Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<OneStudent> students = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] parts = input.split("\\s+");
            String firstName = parts[0];
            String secondName = parts[1];
            double grade = Double.parseDouble(parts[2]);

            OneStudent oneStudent = new OneStudent(firstName, secondName, grade);
            students.add(oneStudent);
        }
        students
                .stream()
                .sorted((s1, s2) -> Double.compare(s2.getGrade(), s1.getGrade()))
                .forEach(s -> System.out.println(s));
    }
}
