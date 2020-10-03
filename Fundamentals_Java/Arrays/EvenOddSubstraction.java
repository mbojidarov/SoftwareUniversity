import java.util.Scanner;

public class EvenOddSubstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     String[]numbers = scanner.nextLine().split(" ");

        int evenSum = 0;
        int oddSum = 0;

        for (String num  : numbers) {
            int currentNum = Integer.parseInt(num);

            if (currentNum % 2 == 0){
                evenSum = evenSum + currentNum;
            }else{
                oddSum = oddSum + currentNum;
            }
        }
        int diff = (evenSum - oddSum);
        System.out.println(diff);
    }
}
