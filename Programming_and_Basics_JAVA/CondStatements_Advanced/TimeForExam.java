import java.util.Scanner;

public class TimeForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int ariveHour = Integer.parseInt(scanner.nextLine());
        int ariveMinutes = Integer.parseInt(scanner.nextLine());

        int examTime = examHour * 60 + examMinutes;
        int ariveTime = ariveHour * 60 + ariveMinutes;

        if (ariveTime <= examTime) {                         // Early + On time
            int before = examTime - ariveTime;

            if (before == 0) {
                System.out.println("On time");
            } else if (before < 10) {
                System.out.println("On time");
                System.out.printf("%d minutes before the start", before);
            } else if (before <= 30) {
                System.out.println("On time");
                System.out.printf("%d minutes before the start", before);
            }else if (before < 60){
                System.out.println("Early");
                System.out.printf("%d minutes before the start", before);
            } else {
                int beforeHours = before / 60;
                int beforeMinutes = before % 60;
                if (beforeMinutes < 10){
                    System.out.println("Early");
                    System.out.printf("%d:0%d hours before the start", beforeHours, beforeMinutes);
                }else{
                    System.out.println("Early");
                    System.out.printf("%d:%d hours before the start", beforeHours, beforeMinutes);
                }
            }
        } else {                               //ariveTime > examTime  //Late
            int after = ariveTime - examTime;
            if (after < 10) {
                System.out.println("Late");
                System.out.printf("%d minutes after the start", after);
            } else if (after < 60) {
                System.out.println("Late");
                System.out.printf("%d minutes after the start", after);
            } else {
                int afterHours = after / 60;
                int afterMinutes = after % 60;
                if (afterMinutes < 10) {
                    System.out.println("Late");
                    System.out.printf("%d:0%d hours after the start", afterHours, afterMinutes);
                }else{
                    System.out.println("Late");
                    System.out.printf("%d:%d hours after the start", afterHours, afterMinutes);
                }
            }
        }
    }
}