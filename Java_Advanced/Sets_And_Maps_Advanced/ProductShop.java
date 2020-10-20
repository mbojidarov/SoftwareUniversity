import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, LinkedHashMap<String, Double>> productShops = new TreeMap<>();

        String input = scanner.nextLine();

        while (!"Revision".equals(input)) {
            String[] parts = Arrays.stream(input.split(",\\s+"))
                    .toArray(String[]::new);
            String shop = parts[0];
            String product = parts[1];
            double price = Double.parseDouble(parts[2]);

            productShops.putIfAbsent(shop, new LinkedHashMap<>());
            productShops.get(shop).put(product, price);

            input = scanner.nextLine();
        }
        productShops.entrySet().stream()
                .sorted((a, b) -> a.getKey().compareTo(b.getKey()))    //No need in TreeMap<>
                .forEach(shop -> {
                    System.out.println(shop.getKey() + "->");
                    shop.getValue().entrySet().stream()
                            .forEach(prod -> {
                                System.out.printf("Product: %s, Price: %.1f%n",
                                        prod.getKey(), prod.getValue());
                            });

                });
                                                 // AVERAGE price included
//        productShops.entrySet().stream()
//                .forEach(shop -> {
//                    System.out.println(shop.getKey() + "->");
//                    System.out.println(shop.getValue().values().stream()
//                            .mapToDouble(e -> e).average().orElse(0));
//                });
    }
}
