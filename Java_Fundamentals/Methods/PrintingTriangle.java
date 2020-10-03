import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        printTriangleTop(input);
        printTriangleBot(input);
    }

    public static void printTriangleTop(int topInput){
        for (int i = 1; i <= topInput; i++) {  //rows
            for (int j = 1; j <= i; j++) {     //nums
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void printTriangleBot(int botInput){
        for (int i = botInput - 1; i > 0; i--) {  //rows
            for (int j = 1; j <= i; j++) {    //nums
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
