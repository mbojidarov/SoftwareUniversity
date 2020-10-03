import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= input; i++) { // kolko reda

            for (int j = 1; j <= i; j++) { // kolko chisla na red
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
