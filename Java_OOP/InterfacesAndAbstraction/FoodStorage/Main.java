package FoodStorage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Buyer> buyers = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String [] parts = scanner.nextLine().split("\\s+");
            if (parts.length == 4){
                buyers.add(new Citizen(parts[0], Integer.parseInt(parts[1]),
                        parts[2], parts[3]));
            }else{
                buyers.add(new Rebel(parts[0], Integer.parseInt(parts[1]), parts[2]));
            }
        }
        String nameBuyer = scanner.nextLine();
        while (!"End".equals(nameBuyer)){
            for (Buyer buyer : buyers) {

//                if (buyer instanceof Citizen)
//                    buyer.buyFood();
//
                if (buyer.getName().equals(nameBuyer)) {
                    buyer.buyFood();
                }
            }
            nameBuyer = scanner.nextLine();
        }
         int totalFood = buyers.stream().mapToInt(Buyer::getFood).sum();

        System.out.println(totalFood);
    }
}
