import java.util.Scanner;

public class HoneyHarvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int numberFlowers = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        double totalHoney = 0;

        switch (flower){
            case "Sunflower":
                if ("Spring".equals(season)){
                    totalHoney = numberFlowers * 10;
                }else if ("Summer".equals(season)){
                    totalHoney = numberFlowers * 8 * 1.1;
                }else if ("Autumn".equals(season)){
                    totalHoney = numberFlowers * 12 * 0.95;
                }
                break;
            case "Daisy":
                if ("Spring".equals(season)){
                    totalHoney = numberFlowers * 12 * 1.1;
                }else if ("Summer".equals(season)){
                    totalHoney = numberFlowers * 8 * 1.1;
                }else if ("Autumn".equals(season)){
                    totalHoney = numberFlowers * 6 * 0.95;
                }
                break;
            case "Lavender":
                if ("Spring".equals(season)){
                    totalHoney = numberFlowers * 12;
                }else if ("Summer".equals(season)){
                    totalHoney = numberFlowers * 8 * 1.1;
                }else if ("Autumn".equals(season)){
                    totalHoney = numberFlowers * 6 * 0.95;
                }
                break;
            case "Mint":
                if ("Spring".equals(season)){
                    totalHoney = numberFlowers * 10 * 1.1;
                }else if ("Summer".equals(season)){
                    totalHoney = numberFlowers * 12 * 1.1;
                }else if ("Autumn".equals(season)){
                    totalHoney = numberFlowers * 6 * 0.95;
                }
                break;
        }
        System.out.printf("Total honey harvested: %.2f", totalHoney);
    }
}
