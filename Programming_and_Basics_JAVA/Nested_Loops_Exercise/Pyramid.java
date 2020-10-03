import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int count = 1;
        boolean isFound = false;

        for (int i = 1; i <= num ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.printf("%d ", count);
                count++;
                if (count > num ){
                    isFound = true;
                    break;
                }
            }
            if (isFound){
                break;
            }
            System.out.println();
        }
    }
}
