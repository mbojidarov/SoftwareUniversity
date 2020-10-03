import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        String[] rotation = input;

        for (int i = 0; i < n; i++) {
            String temp = rotation[0];
            for (int j = 0; j < rotation.length - 1; j++) {
                rotation[j] = rotation[j + 1];
            }
            rotation[rotation.length - 1] = temp;
        }
        System.out.println(String.join(" ", rotation));
    }
}
