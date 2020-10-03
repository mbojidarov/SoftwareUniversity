import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationBudget = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());

        int daysCount = 0;
        int failedCount = 0;
        boolean isSaved = false;

        String action = scanner.nextLine();
        double sum = Double.parseDouble(scanner.nextLine());

        while (money < vacationBudget) {
            daysCount++;

            if ("spend".equals(action)) {
                failedCount++;
                money = money - sum;
                if (money < 0) {
                    money = 0;
                }
                if (failedCount == 5) {
                    break;
                }
            } else { //save.equals(action)
                money = money + sum;
                failedCount = 0;
                if (money >= vacationBudget){
                    isSaved = true;
                    break;
                }
            }
            action = scanner.nextLine();
            sum = Double.parseDouble(scanner.nextLine());
        }
        if (isSaved || money >= vacationBudget){
            System.out.printf("You saved the money for %d days.", daysCount);
        }else {
            System.out.println("You can't save the money.");
            System.out.print(daysCount);
        }
    }
}
