import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employeeOne = Integer.parseInt(scanner.nextLine());
        int employeeTwo = Integer.parseInt(scanner.nextLine());
        int employeeThree = Integer.parseInt(scanner.nextLine());

        int totalPeopleLeft = Integer.parseInt(scanner.nextLine());
        int hoursCount = 0;

        while (totalPeopleLeft > 0){
            hoursCount++;

            if(hoursCount % 4 == 0){
            continue;

            }else{
            int peoplePerHour =employeeOne + employeeTwo + employeeThree;
            totalPeopleLeft = totalPeopleLeft -peoplePerHour;
            }
        }
        System.out.printf("Time needed: %dh.", hoursCount);
    }
}
