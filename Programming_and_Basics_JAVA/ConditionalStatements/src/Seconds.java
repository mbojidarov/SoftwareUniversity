import java.util.Scanner;

public class Seconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstTime = Integer.parseInt(scanner.nextLine());
        int secondTime = Integer.parseInt(scanner.nextLine());
        int thirdTime = Integer.parseInt(scanner.nextLine());

        int totalTime = firstTime + secondTime + thirdTime;
        int totalTimeMinutes = totalTime / 60;
        int totalTimeSeconds = totalTime % 60;

        if (totalTimeSeconds < 10) {
            System.out.printf("%d:0%d", totalTimeMinutes, totalTimeSeconds);
        } else {
            System.out.printf("%d:%d", totalTimeMinutes, totalTimeSeconds);
        }
    }
}
