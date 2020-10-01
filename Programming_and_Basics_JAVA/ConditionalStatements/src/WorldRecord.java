import java.util.Scanner;

public class WorldRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double wrSeconds = Double.parseDouble(scanner.nextLine());
        double metersDistance = Double.parseDouble(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());

        double slowtimeSeconds = (Math.floor(metersDistance / 15)) * 12.5;
        double totalTime = metersDistance * secondsPerMeter + slowtimeSeconds;

        if (totalTime >= wrSeconds) {
            double diferent = totalTime - wrSeconds;
            System.out.printf("No, he failed! He was %.2f seconds slower.", diferent);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }

    }
}
