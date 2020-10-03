import java.util.Scanner;

public class LeftandRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i <= numbers * 2; i++) {
            int curentNum = Integer.parseInt(scanner.nextLine());

            if (numbers  >= i) {
                leftSum = leftSum + curentNum;
            } else {
                rightSum = rightSum + curentNum;
            }
        }
            if (leftSum == rightSum){
                System.out.printf("Yes, sum = %d", leftSum);
            }else{
                System.out.printf("No, diff = %d", Math.abs(leftSum - rightSum));
            }
    }
}