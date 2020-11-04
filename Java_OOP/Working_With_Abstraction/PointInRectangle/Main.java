package PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // x, y -> 2D Coordinate system
        // each point is described by x and y coordinates

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int botX = input[0];
        int botY = input[1];
        int topX = input[2];
        int topY = input[3];

        Rectangle rectangle = new Rectangle
                (new Point(botX, botY), new Point(topX, topY));


        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            input = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            int x = input[0];
            int y = input[1];

                                        // Point point = new Point(x, y);
            boolean contains = rectangle.contains(new Point(x, y));

            System.out.println(contains);
        }
    }
}
