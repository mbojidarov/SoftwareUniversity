import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int input = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= input; i++) {
            int number = i;
            if (ifIsTopNumber(number)){
                System.out.println(number);
            }
        }
    }

    private static boolean ifIsTopNumber(int number) {
        boolean isHasOdd =  false;
        int sum = 0;
        while (number > 0){

            int digit = number % 10;
            sum = sum + digit;
            number = number /10;

            if (number % 2 != 0){
                isHasOdd = true;
            }
        }
        if (sum % 8 == 0 && isHasOdd){
            return true;
        }else{
            return false;
        }
    }
}
//        int sum = 0;
//        String[] numbers = new String[input];
//        for (int i = 1; i < input; i++) {
//            numbers[i] = "" + i;
//
//            String[] splitNumbers = numbers[i].split("");
//            boolean isOdd = false;
//
//            for (int j = 0; j < splitNumbers.length; j++) {
//                int currentNumber = Integer.parseInt(splitNumbers[j]);
//                sum = sum + currentNumber;
//                if (currentNumber % 2 != 0){
//                    isOdd = true;
//                }
//
//                if (sum % 8 == 0 && isOdd){
//                    System.out.println(numbers[i]);
//            }
//        }
//            sum = 0;
//        }