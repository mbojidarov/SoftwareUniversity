import java.util.Scanner;

public class EqualSumsEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        for (int i = first; i <= second ; i++) {
            String currentNum = "" + i;
            int evenSum = 0;
            int oddSumm = 0;
            for (int j = 0; j < currentNum.length() ; j++) {
                int digit = Integer.parseInt("" + currentNum.charAt(j));
                if (j % 2 == 0){
                    evenSum = evenSum + digit;
                }else{
                    oddSumm = oddSumm + digit;
                }
            }
            if (evenSum == oddSumm){

                System.out.printf("%d ", i);
            }

        }
    }
}
