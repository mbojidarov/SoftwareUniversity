import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int grade = 1;
        double sumEvaluation = 0.0;

        while (grade <= 12){
            double evaluation = Double.parseDouble(scanner.nextLine());

            if (evaluation >= 4){
                sumEvaluation += evaluation;
                grade++;
            }
        }
        double avgEvaluation = sumEvaluation / (grade - 1);
        System.out.printf("%s graduated. Average grade: %.2f",name ,avgEvaluation);
    }
}
