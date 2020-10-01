import java.util.Scanner;

public class TimePlus15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputHours = Integer.parseInt(scanner.nextLine());
        int inputMinutes = Integer.parseInt(scanner.nextLine());

        int hoursInMinutes = inputHours * 60;
        int totalMinutes = hoursInMinutes + inputMinutes + 15;

        int outputHours = totalMinutes / 60;
        int outputMinutes = totalMinutes % 60;

        if (outputHours > 23) {
            outputHours = 0;
        }
        if (outputMinutes < 10) {
            System.out.printf("%d:0%d", outputHours, outputMinutes);
        } else {
            System.out.printf("%d:%d", outputHours, outputMinutes);
        }
    }
}