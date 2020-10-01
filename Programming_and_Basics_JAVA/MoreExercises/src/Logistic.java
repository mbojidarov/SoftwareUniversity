import java.util.Scanner;

public class Logistic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int microCargo = 0;
        int truckCargo = 0;
        int trainCargo = 0;


        for (int i = 0; i < input; i++) {
            int curentCargo = Integer.parseInt(scanner.nextLine());

            if (curentCargo <= 3){
                microCargo += curentCargo;

            }else if (curentCargo <= 11){
                truckCargo += curentCargo;

            }else{
                trainCargo += curentCargo;
            }
        }
        int totalCargo = microCargo + truckCargo + trainCargo;
        double priceAvg = (microCargo *1.0*200 + truckCargo*1.0*175 + trainCargo*1.0*120) / totalCargo;
        double microPerc = microCargo * 1.0 / totalCargo * 100;
        double truckPerc = truckCargo * 1.0 / totalCargo * 100;
        double trainPerc = trainCargo * 1.0 / totalCargo * 100;

        System.out.printf("%.2f%n", priceAvg);
        System.out.printf("%.2f%%%n", microPerc);
        System.out.printf("%.2f%%%n", truckPerc);
        System.out.printf("%.2f%%%n", trainPerc);
    }
}
