import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());

        getAreaResult(width, length);

        double area = getAreaResult(width, length);
        System.out.printf("%.0f", area);
    }

    private static double getAreaResult(double w, double l) {

        return w * l;
    }
}
