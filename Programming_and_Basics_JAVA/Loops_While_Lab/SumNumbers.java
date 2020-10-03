import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sum = 0;

        while (!input.equals("Stop")){
            int curentNum = Integer.parseInt(input);
            sum = sum + curentNum;

            input = scanner.nextLine();
        }
        System.out.println(sum);
    }
}
