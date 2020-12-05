package MathOperation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(MathOperation.add(2, 2));
        System.out.println(MathOperation.add(3, 3, 3));
        System.out.println(MathOperation.add(4, 4, 4, 4));
    }
}
