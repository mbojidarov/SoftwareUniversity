import java.util.Scanner;

public class AreaFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();

        if (figure.equals("square")) {
            double sideSQU = Double.parseDouble(scanner.nextLine());
            double areaSQU = sideSQU * sideSQU;
            System.out.printf("%.3f", areaSQU);

        } else if (figure.equals("rectangle")) {
            double sideRECT1 = Double.parseDouble(scanner.nextLine());
            double sideRECT2 = Double.parseDouble(scanner.nextLine());
            double areaRECT = sideRECT1 * sideRECT2;
            System.out.printf("%.3f", areaRECT);

        } else if (figure.equals("circle")) {
            double radiusCIRCLE = Double.parseDouble(scanner.nextLine());
            double areaCIRC = Math.PI * (radiusCIRCLE * radiusCIRCLE);
            System.out.printf("%.3f", areaCIRC);

        } else {
            double sideTRI = Double.parseDouble(scanner.nextLine());
            double heigh = Double.parseDouble(scanner.nextLine());
            double areaTRI = (sideTRI * heigh) / 2;
            System.out.printf("%.3f", areaTRI);

        }
    }
}

