import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputCount = Integer.parseInt(scanner.nextLine());
        int courentNumber = 0;
        int count = 0;
        int max = Integer.MIN_VALUE;

        while (count < inputCount){
            courentNumber = Integer.parseInt(scanner.nextLine());

            if (courentNumber >= max){
                max = courentNumber;
            }
            count++;
        }
        System.out.println(max);
    }
}
