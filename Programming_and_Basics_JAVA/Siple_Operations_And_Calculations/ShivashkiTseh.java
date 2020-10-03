import java.util.Scanner;

public class ShivashkiTseh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tables = Integer.parseInt(scanner.nextLine());
        double lenght = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());

        double oneCoverArea = (lenght + 0.6) * (width + 0.6);
        double coverPrice = oneCoverArea * 7;
        double oneCareArea = (lenght / 2) * (lenght / 2);
        double carePrice = oneCareArea * 9;

        double totalUSD = tables * (coverPrice + carePrice);
        double totalBGN = totalUSD * 1.85;

        System.out.printf("%.2f USD%n", totalUSD);
        System.out.printf("%.2f BGN", totalBGN);
    }
}
