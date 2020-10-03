import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999 ; i++) {
            String curentNum = "" + i;
            int count = 0;
            for (int j = 0; j < curentNum.length(); j++) {
                int digit = Integer.parseInt("" + curentNum.charAt(j));
                if (digit == 0){
                    break;
                }
                // boolean checkIsTrue = false;
                if (n % digit == 0){
                    //checkIsTrue = true;
                    count++;
                }else{
                    break;
                }
                if (count == 4){
                    System.out.print(i + " ");
                }
            }

        }
    }
}
