import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> courses = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!"end".equals(input)) {
            String[] parts = input.split("\\s+:\\s+");
            String courseName = parts[0];
            String studentName = parts[1];

            courses.putIfAbsent(courseName, new ArrayList<>());
            courses.get(courseName).add(studentName);

//            List<String> students = courses.get(courseName);
//            students.add(studentName);

            input = scanner.nextLine();
        }
        courses.entrySet()
                .stream()
                .sorted((a, b) ->
                        Integer.compare(b.getValue().size(), a.getValue().size()))
                //   int result2 = b.getValue().size() - a.getValue().size();
                .forEach(element -> {
                    System.out.printf("%s: %d%n",
                            element.getKey(), element.getValue().size());
                    element.getValue()
                            .stream()
                            .sorted((s1, s2) -> s1.compareTo(s2))
                            .forEach(stud ->
                                    System.out.printf("-- %s%n", stud));
                });

    }
}
