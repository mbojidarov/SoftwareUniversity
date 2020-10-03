import java.util.Scanner;

public class InchesCentimeters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double inch = Double.parseDouble(scan.nextLine());
        double centim = inch * 2.54;

        System.out.println(centim);
    }
}
