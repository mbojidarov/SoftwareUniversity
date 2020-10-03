import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int studentsTotal = Integer.parseInt(scanner.nextLine());
        double lightSabrePrice = Double.parseDouble(scanner.nextLine()); // 10% more need.ceil
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine()); //vseki 6-ti e free

        double lightTotalPrice = Math.ceil(studentsTotal * 1.1) * lightSabrePrice;
        double robeTotalPrice = studentsTotal * robePrice;
        double every6free = Math.floor(1.0 * studentsTotal / 6);
        double beltTotalPrice = (studentsTotal - every6free) * beltPrice;

        double totalPrice = lightTotalPrice + robeTotalPrice + beltTotalPrice;

        if (totalPrice <= budget) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.", (totalPrice - budget));
        }
    }
}
