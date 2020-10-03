import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        //int totalmoney = 0;

        while (!"End".equals(destination)){
            int budget = Integer.parseInt(scanner.nextLine());
            for (int totalmoney = 0; totalmoney < budget ;) {
            //while (totalmoney < budget) {
                int currentSaving = Integer.parseInt(scanner.nextLine());
                totalmoney = totalmoney + currentSaving;
                if (totalmoney >= budget) {
                    System.out.printf("Going to %s!%n", destination);
                    //totalmoney = 0;
                    break;
                }
            }
            destination = scanner.nextLine();
        }
    }
}
