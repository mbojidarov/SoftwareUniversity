import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        int[] train = new int[input];
        for (int i = 0; i < train.length; i++) {
            train[i] = Integer.parseInt(scanner.nextLine());
//
//            int people = Integer.parseInt(scanner.nextLine());
//            sum += people;
//            System.out.print(people + " ");
        }
//        System.out.println();
//        System.out.println(sum);
        for (int waggon : train) {
            sum += waggon;
            System.out.print(waggon + " ");
            
        }
        System.out.println();
        System.out.println(sum);
    }
}
