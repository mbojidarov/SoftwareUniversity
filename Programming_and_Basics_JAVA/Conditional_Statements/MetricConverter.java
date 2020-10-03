import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inputNumber = Double.parseDouble(scanner.nextLine());
        String metricINP = scanner.nextLine();
        String metricOTP = scanner.nextLine();

        if (metricINP.equals("mm")) {
            inputNumber = inputNumber /1000;
        } else if (metricINP.equals("cm")) {
            inputNumber = inputNumber /100;
        }

        if (metricOTP.equals("mm")) {
            inputNumber = inputNumber *1000;
        } else if (metricOTP.equals("cm")) {
            inputNumber = inputNumber * 100;
        }

        System.out.printf("%.3f", inputNumber);


    }
}
