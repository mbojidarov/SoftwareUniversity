import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resources = new LinkedHashMap<>();

        String item = scanner.nextLine();

        while (!"stop".equals(item)){
            int quantity = Integer.parseInt(scanner.nextLine());
//            if (resources.containsKey(item)){
//                int currentQuantity = resources.get(item);
//                resources.put(item,currentQuantity + quantity);
//            }else{
//                resources.put(item, quantity);
//            }
            resources.putIfAbsent(item, 0);
            int newQuantity = resources.get(item) + quantity;
            resources.put(item, newQuantity);

            item = scanner.nextLine();
        }
        resources
                .forEach((k, v) -> System.out.printf("%s -> %d%n", k, v));

//        resources.entrySet().stream()
//                .forEach(e -> System.out.printf("%s -> %d%n", e.getKey(), e.getValue()));

//        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
//            System.out.println(entry.getKey() + " -> " + entry.getValue());
//        }
    }
}
