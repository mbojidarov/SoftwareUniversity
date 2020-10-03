import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 1; i <= numbers; i++){
            int num = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0){
            sumEven = sumEven + num;
            }else{
                sumOdd = sumOdd + num;
            }
        }
        if (sumEven == sumOdd){
            System.out.printf("Yes%nSum = %d", sumEven);
        } else {
            System.out.printf("No%nDiff = " + Math.abs(sumEven - sumOdd ));
        }
    }
}
