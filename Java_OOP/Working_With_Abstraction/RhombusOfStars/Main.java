package RhombusOfStars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printTopHalf(n);
        printBottomHalf(n - 1);
    }
    public static void printTopHalf(int count) {
        for (int i = 1; i <= count; i++) {
            printStringNumberOfTimes(count - i, " ");
            printStringNumberOfTimes(i, "* ");
            System.out.println();
        }
    }
    public static void printBottomHalf(int count) {
        for (int i = 1; i <= count; i++) {
            printStringNumberOfTimes(i, " ");
            printStringNumberOfTimes(count - (i - 1), "* ");
            System.out.println();
        }
    }
    private static void printStringNumberOfTimes(int count, String string){
        for (int i = 0; i < count; i++) {
            System.out.print(string);     //print string(spaces or stars)
        }
    }

    //TOP half print
//         for (int row = 1; row <= n; row++) {
//         for (int j = 0; j < (n - row); j++) {
//            System.out.print(" ");     //print spaces
//         }
//        for (int i = 0; i < row; i++) {
//            System.out.print("* ");    //print stars
//        }
//        System.out.println();
//        }
    //BOTTOM half print
//       for (int row = 1; row <= (n - 1); row++) {
//        for (int i = 0; i < row; i++) {
//            System.out.print(" ");    //print spaces
//        }
//        for (int j = 0; j < (n - row); j++) {
//            System.out.print("* ");     //print stars
//        }
//        System.out.println();
//        }

}
