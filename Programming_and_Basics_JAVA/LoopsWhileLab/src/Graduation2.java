import java.util.Scanner;

public class Graduation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int grade = 1;
        int failsCount = 0;
        double sumEvaluation = 0.0;

        while (grade <= 12) {
            double evaluation = Double.parseDouble(scanner.nextLine());

            if (evaluation >= 4) {
                sumEvaluation += evaluation;
                grade++;
                failsCount = 0;
            } else {
                failsCount++;
            }
            if (failsCount == 2) {
                System.out.printf("%s has been excluded at %d grade", name, grade);
                break;
            }
        }
        if (failsCount < 2) {
            double avgEvaluation = sumEvaluation / (grade - 1);
            System.out.printf("%s graduated. Average grade: %.2f", name, avgEvaluation);
        }
    }
}
