import java.util.Scanner;

public class Rectangle  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());

        double lenght = Math.abs(x1 - x2);
        double width = Math.abs(y1 - y2);
        double area = lenght * width;
        double perimeter = (lenght + width) * 2;

        System.out.printf("%.2f%n", area);
        System.out.printf("%.2f%n", perimeter);

    }

}
