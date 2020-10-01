import java.util.Scanner;

public class Savings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inCome = Double.parseDouble(scanner.nextLine());
        int montsToSave = Integer.parseInt(scanner.nextLine());
        double outCome = Double.parseDouble(scanner.nextLine());

        double unpredOutcomes = inCome * 0.30;
        double FreeMoney = inCome - unpredOutcomes - outCome;
        double totalFreeMoney = montsToSave * FreeMoney;
        double percentPermonth = (FreeMoney / inCome) * 100;

        System.out.printf("She can save %.2f%%%n", percentPermonth);
        System.out.printf("%.2f", totalFreeMoney);
    }
}
