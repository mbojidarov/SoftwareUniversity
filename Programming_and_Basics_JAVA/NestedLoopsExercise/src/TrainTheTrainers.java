import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jury = Integer.parseInt(scanner.nextLine());
        String presentation = scanner.nextLine();
        double sumGrades = 0;
        double totalSumGrades = 0;
        double avgGrades = 0;
        int count = 0;

        while (!"Finish".equals(presentation)){
            for (int i = 0; i < jury; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                count++;
                sumGrades = sumGrades + grade;
            }
            avgGrades = sumGrades / jury;
            System.out.printf("%s - %.2f.%n", presentation, avgGrades);
            totalSumGrades = totalSumGrades + sumGrades;
            sumGrades = 0;
            presentation = scanner.nextLine();
        }
        double avg = totalSumGrades / count;
        System.out.printf("Student's final assessment is %.2f.", avg);
    }
}
