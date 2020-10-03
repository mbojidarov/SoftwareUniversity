import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] first = scanner.nextLine().split(" ");
        String[] second = scanner.nextLine().split(" ");
        int sum = 0;
        boolean isIdentical = true;

        for (int i = 0; i < first.length; i++) {
            if (first[i].equals(second[i])) {
                int current = Integer.parseInt(first[i]);
                sum = sum + current;
            } else {
                isIdentical = false;
                System.out.printf("Arrays are not identical. " +
                        "Found difference at %d index.", i);
                break;
                // return;
            }
        }
        if (isIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }

    }
}
