import java.util.Scanner;

public class DevideWithout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int p2Count = 0;
        int p3Count = 0;
        int p4Count = 0;

        for (int i = 0; i < input; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number % 2 == 0 ){
                p2Count = p2Count + 1;
            }
            if (number % 3 == 0){
                p3Count = p3Count + 1;
            }
            if (number % 4 == 0){
                p4Count = p4Count +1;
            }

        }
        double percent2 = p2Count * 1.0 / input * 100;
        double percent3 = p3Count * 1.0 / input * 100;
        double percent4 = p4Count * 1.0 / input * 100;

        System.out.printf("%.2f%%%n", percent2);
        System.out.printf("%.2f%%%n", percent3);
        System.out.printf("%.2f%%%n", percent4);
    }
}
