import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        //String [] days = new String[6];
        String[] days = {"Monday", "Tuesday",
                "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (input < 1 || input > 7){
            System.out.println("Invalid day!");
        }else {
            System.out.println(days [input - 1]);
        }
    }
}
