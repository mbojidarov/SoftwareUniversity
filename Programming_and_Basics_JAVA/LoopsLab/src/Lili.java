import java.util.Scanner;

public class Lili {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());


        int toyCount = 0;
        double moneyRD = 0;
        //double dobavka = 0;
        for (int i = 1; i <= age; i++){
            if (i % 2 == 0){
                //dobavka = dobavka + 10;
                //moneyRD = moneyRD + dobavka;
                moneyRD = moneyRD + (i * 10.0 / 2) - 1;


            } else {
                toyCount = toyCount +1;
            }
        }
        double toysTotalMoney = toyPrice * toyCount;
        double moneyTotal = moneyRD + toysTotalMoney;

        double razlika = Math.abs(moneyTotal - washingMachinePrice);
        if (moneyTotal >= washingMachinePrice){
            //double moneyLeft = moneyTotal - washingMachinePrice;
            System.out.printf("Yes! %.2f", razlika);

        }else{
            //double moneyNeed = washingMachinePrice - moneyTotal;
            System.out.printf("No! %.2f", razlika);
        }
    }
}
