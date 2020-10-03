import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int resultSum = sumOfFirstTwoIntegers(firstNum, secondNum);
        int resultSubtract = subtractThirdNum(resultSum, thirdNum);

        System.out.println(resultSubtract);
    }

    private static int subtractThirdNum(int resultSum, int thirdNum) {
        int resultSub = resultSum - thirdNum;
        return resultSub;
    }

    private static int sumOfFirstTwoIntegers(int firstNum, int secondNum) {
        int resultSum = firstNum + secondNum;
        return resultSum;
    }
}
