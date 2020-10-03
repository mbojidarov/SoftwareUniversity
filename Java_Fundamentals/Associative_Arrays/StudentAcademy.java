import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> students = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            students.putIfAbsent(studentName, new ArrayList<>());
            students.get(studentName).add(grade);
        }
        students.entrySet()
                .stream()
                .filter(student -> student.getValue().stream()
                        .mapToDouble(Double::doubleValue).average().orElse(0) >= 4.50)  // .getAsDouble()
                .sorted((student1, student2) -> {
                    double first = student1.getValue().stream()
                            .mapToDouble(e -> Double.valueOf(e))  // Double::doubleValue
                            .average().orElse(0);           // .getAsDouble()
                    double second = student2.getValue().stream()
                            .mapToDouble(Double::doubleValue)
                            .average().orElse(0);           // .getAsDouble()
                    return Double.compare(second, first);         // decending order
                })
                .forEach(student -> System.out.printf("%s -> %.2f%n",
                        student.getKey(),
                        student.getValue().stream()
                                .mapToDouble(Double::doubleValue).average().getAsDouble())); // .orElse(0)
    }
}
