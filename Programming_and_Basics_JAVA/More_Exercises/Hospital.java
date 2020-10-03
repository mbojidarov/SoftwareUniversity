import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        int doctors = 7;
        int treated = 0;
        int untreated = 0;
        int countDay = 0;

        for (int i = 1; i <= days; i++) {
            countDay++;
            int patients = Integer.parseInt(scanner.nextLine());

            if (countDay == 3 && untreated > treated) {
                doctors++;
                countDay = 0;
            }

            if (doctors >= patients) {
                treated = treated + patients;
            } else {
                treated = treated + doctors;
                untreated = untreated + (patients - doctors);
            }
        }
        System.out.printf("Treated patients: %d.%n", treated);
        System.out.printf("Untreated patients: %d.", untreated);
    }
}
