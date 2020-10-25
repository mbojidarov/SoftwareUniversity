package CompanyRoster;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Department> departmentMap = new HashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];

            Employee employee;

            if (input.length == 6){
                String email = input[4];
                int age = Integer.parseInt(input[5]);
            employee = new Employee(name, salary, position, department, email, age);

            }else if (input.length == 4){
            employee = new Employee(name, salary, position, department);

            }else{ //length == 5
                try {
                    int age = Integer.parseInt(input[4]);
                    employee = new Employee(name, salary, position, department, age);
                }catch (NumberFormatException e){
                    String email = input[4];
                    employee = new Employee(name, salary, position, department, email);
                }
            }
            //suzdavam nov otdel
            departmentMap.putIfAbsent(department, new Department(department));
            //dobavqm slujitel
            departmentMap.get(department).getEmployeeList().add(employee);
        }
        Department maxAverageSalaryDepartment = departmentMap.entrySet()
                .stream()
                .max(Comparator.comparingDouble(entry ->
                        entry.getValue().getAverageSalary()))
                .get()
                .getValue();

        System.out.println("Highest Average Salary: " + maxAverageSalaryDepartment.getNameDepartment());
        maxAverageSalaryDepartment.getEmployeeList()
                .stream()
                .sorted((emp1, emp2) -> Double.compare(emp2.getSalary(), emp1.getSalary()))
                .forEach(employee -> System.out.println(employee.toString()));

    }
}
