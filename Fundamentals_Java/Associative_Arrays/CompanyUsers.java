import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companies = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!"End".equals(input)) {
            String[] parts = input.split(" -> ");
            String companyName = parts[0];
            String employeeID = parts[1];

            companies.putIfAbsent(companyName, new LinkedList<>());
            // проверка дали това ID го няма о тогава да го добави
            if (!companies.get(companyName).contains(employeeID)) {
                companies.get(companyName).add(employeeID);
            }
            input = scanner.nextLine();
        }
        companies
                .entrySet()
                .stream()
                .sorted((c1, c2) -> c1.getKey().compareTo(c2.getKey()))
                .forEach(comp -> {
                    System.out.println(comp.getKey());
                    comp.getValue()
//                      NE! .stream()
//                      NE! .sorted((emp1, emp2) -> emp1.compareTo(emp2))
                            .forEach(empID ->
                                    System.out.printf("-- %s%n", empID));
                });
    }
}
