import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        boolean isSpecial = false;

        for (int i = 1; i <= input; i++) {
            int currentNum = i;
            int sum = 0;
            while (currentNum > 0){
                sum = sum + currentNum % 10;
                currentNum = currentNum / 10;
            }
            if (sum == 5 || sum == 7 || sum == 11){
                isSpecial = true;
                System.out.println(i + " -> True");
            }else{
                System.out.println(i + " -> False");

            }
        }
    }
}
