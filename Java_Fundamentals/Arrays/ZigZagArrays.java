import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int[] first = new int[input];
        int[] second = new int[input];

        for (int i = 0; i < input; i++) {
            String[] temp = scanner.nextLine().split(" ");

            if (i % 2 == 0) {
                first[i] = Integer.parseInt(temp[0]);
                second[i] = Integer.parseInt(temp[1]);

            } else {
                second[i] = Integer.parseInt(temp[0]);
                first[i] = Integer.parseInt(temp[1]);
            }
        }
        for (int i : first) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : second) {
            System.out.print(i + " ");
        }
    }
}

