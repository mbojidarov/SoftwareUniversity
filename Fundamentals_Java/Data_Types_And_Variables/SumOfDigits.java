import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            String currentSymbol = "";
            currentSymbol = currentSymbol + input.charAt(i);
            int currentDigit = Integer.parseInt(currentSymbol);
            sum = sum + currentDigit;
        }
        System.out.println(sum);

//      SECOND VARIANT
//        int number = Integer.parseInt(scanner.nextLine());
//            int sum = 0;

//            while (number > 0){
//                int lastDigit = number % 10;
//                sum = sum + lastDigit;
//                number = number / 10;
//
//               System.out.println(sum);
    }
}
