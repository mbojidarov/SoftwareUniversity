import java.util.Scanner;

public class HoneyWinterReserves {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double needHoney = Double.parseDouble(scanner.nextLine());
        String nameBee = scanner.nextLine();

        double totalHoney = 0;
        boolean isHoneyOK = false;

        while (!"Winter has come".equals(nameBee)) {
            double harvestHoney = 0;
            double eatHoney = 0;

            for (int i = 1; i <= 6; i++) {
                double currentHarvest = Double.parseDouble(scanner.nextLine());
                totalHoney = totalHoney + currentHarvest;
                if (currentHarvest >= 0) {
                    harvestHoney = harvestHoney + currentHarvest;
                } else {
                    eatHoney = eatHoney + currentHarvest;
                }
            }
            double currentTotalHoney = harvestHoney + (eatHoney);
            if (currentTotalHoney < 0) {
                System.out.printf("%s was banished for gluttony%n", nameBee);
            }
            if (totalHoney >= needHoney){
                isHoneyOK = true;
                break;
            }
            nameBee = scanner.nextLine();
        }
            //double honeyDiff = (needHoney - totalHoney);
        if (isHoneyOK){
            System.out.printf("Well done! Honey surplus %.2f.", totalHoney - needHoney);
        }else{
            System.out.printf("Hard Winter! Honey needed %.2f.", (needHoney - totalHoney));
        }
    }
}
