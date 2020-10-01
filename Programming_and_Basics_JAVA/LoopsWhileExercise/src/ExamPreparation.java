import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badGrades = Integer.parseInt(scanner.nextLine());
        String curentProblem = scanner.nextLine();
        int badCaount = 0;
        double avgScore = 0;
        int problemsCount = 0;
        String lastProblem = "";
        int sumGrades = 0;
        boolean isFailed = false;

        while (!"Enough".equals(curentProblem)) {
            lastProblem = curentProblem;
            problemsCount++;

            int curentGrade = Integer.parseInt(scanner.nextLine());
            sumGrades = sumGrades + curentGrade;
            avgScore = sumGrades * 1.0 / problemsCount;
            if (curentGrade <= 4) {
                badCaount++;
            }
            if (badCaount == badGrades) {
                isFailed = true;
                break;
            }
            curentProblem = scanner.nextLine();
        }
        if (isFailed) {
            System.out.printf("You need a break, %d poor grades.", badGrades);
        } else {
            System.out.printf("Average score: %.2f%n", avgScore);
            System.out.printf("Number of problems: %d%n", problemsCount);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}
