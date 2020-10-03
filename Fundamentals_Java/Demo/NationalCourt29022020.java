import java.util.Scanner;

public class NationalCourt29022020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employeeOne = Integer.parseInt(scanner.nextLine());
        int employeeTwo = Integer.parseInt(scanner.nextLine());
        int employeeThree = Integer.parseInt(scanner.nextLine());
        int totalPeopleLeft = Integer.parseInt(scanner.nextLine());

        int totalHours = 0;

        while (totalPeopleLeft > 0){
            totalHours++;

            if (totalHours % 4 == 0){
                continue;

            }else{
                int peoplePerHour = employeeOne + employeeTwo + employeeThree;
                totalPeopleLeft = totalPeopleLeft - peoplePerHour;
            }

        }
        System.out.printf("Time needed: %dh.", totalHours);
    }
}
