import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());
        double currentMoney = 0;
        int yrsOld = 18;

        for (int i = 1800; i <= year ; i++) {
            if (i % 2 == 0){
                currentMoney = currentMoney + 12000;
            } else {
                currentMoney = currentMoney + (12000 + 50 * yrsOld);
            }
            yrsOld++;
        }
        double moneyLeft = Math.abs( money - currentMoney);
        if (money >= currentMoney){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", moneyLeft);
        }else{
            System.out.printf("He will need %.2f dollars to survive.", moneyLeft);
        }
    }
}
