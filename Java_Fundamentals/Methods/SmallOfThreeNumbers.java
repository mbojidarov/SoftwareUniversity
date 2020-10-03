import java.util.Scanner;

public class SmallOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int smallest = findSmallestNumber(num1, num2, num3);
        System.out.println(smallest);
    }

    private static int findSmallestNumber(int num1, int num2, int num3) {
        int maxDigit = 0;
        if (num1 < num2 && num1 < num3){
            maxDigit = num1;
        }else if (num2 < num1 && num2 < num3){
            maxDigit = num2;
        }else{
            maxDigit = num3;
        }
        return maxDigit;
    }
}
