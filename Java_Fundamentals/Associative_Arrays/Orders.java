import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> quantityMap = new LinkedHashMap<>();
        Map<String, Double> priceMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!"buy".equals(input)) {
            String[] parts = input.split("\\s+");
            String product = parts[0];
            double price = Double.parseDouble(parts[1]);
            int quantity = Integer.parseInt(parts[2]);

            priceMap.put(product, price);
            quantityMap.putIfAbsent(product, 0);
            int newQuantity = quantityMap.get(product) + quantity;
            quantityMap.put(product, newQuantity);

            input = scanner.nextLine();
        }
        priceMap
                .forEach((k, v) -> System.out.printf("%s -> %.2f%n",
                        k, v * quantityMap.get(k)));
    }
}
