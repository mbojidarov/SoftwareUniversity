import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Student> students = new ArrayList<>();

        while (!"end".equals(input)){
            String[] parts = input.split("\\s+");
            String firstName = parts[0];
            String lastName = parts[1];
            int age = Integer.parseInt(parts[2]);
            String city = parts[3];

            //създаваме нов Обект от тип Студент и конструктор
            Student student = new Student(firstName, lastName, age, city);

            students.add(student);

            input = scanner.nextLine();
        }
        String city = scanner.nextLine();

        for (Student student : students) {       // в Students класа
            if (city.equals(student.getCity())){ //дефинираме getters/setters
                System.out.printf("%s %s is %d years old%n",
                        student.getFirstName(),
                        student.getLastName(),
                        student.getAge());
            }
        }
    }
}
