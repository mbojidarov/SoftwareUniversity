import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputCount = Integer.parseInt(scanner.nextLine());
        int courentNumber = 0;
        int count = 0;
        int min = Integer.MAX_VALUE;

        while (count < inputCount){
            courentNumber = Integer.parseInt(scanner.nextLine());
            count++;
            if (courentNumber <= min){
                min = courentNumber;
            }
        }
        System.out.println(min);
    }
}
