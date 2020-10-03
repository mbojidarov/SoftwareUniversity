import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        //double resultPower = getMathPower(number, power);
        //System.out.printf("%.0f", resultPower);
        double resultPower = 1;
        System.out.println(new DecimalFormat("0.####").format(getMathPower(number, power)));
    }

    private static double getMathPower(double number, int power) {
        double result = Math.pow(number, power);
        return result;
    }
}
