import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int p1Count = 0;
        int p2Count = 0;
        int p3Count = 0;
        int p4Count = 0;
        int p5Count = 0;

        for (int i = 1; i <= input; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number < 200){
                p1Count = p1Count + 1;
            }else if (number < 400){
                p2Count = p2Count + 1;
            }else if (number < 600){
                p3Count = p3Count + 1;
            }else if (number < 800){
                p4Count = p4Count +1;
            }else{
                p5Count = p5Count + 1;
            }
        }
        double percent1 = p1Count * 1.0 / input * 100;
        double percent2 = p2Count * 1.0 / input * 100;
        double percent3 = p3Count * 1.0 / input * 100;
        double percent4 = p4Count * 1.0 / input * 100;
        double percent5 = p5Count * 1.0 / input * 100;

        System.out.printf("%.2f%%%n", percent1);
        System.out.printf("%.2f%%%n", percent2);
        System.out.printf("%.2f%%%n", percent3);
        System.out.printf("%.2f%%%n", percent4);
        System.out.printf("%.2f%%%n", percent5);
    }
}
