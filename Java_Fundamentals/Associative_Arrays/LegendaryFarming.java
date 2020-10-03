import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> keyMaterials = new LinkedHashMap<>();
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);

        Map<String, Integer> junk = new LinkedHashMap<>();
        boolean isObtained = false;

        while (!isObtained) {
            //3 Motes 5 stones 5 Shards
            String[] input = scanner.nextLine().split("\\s+");

            for (int i = 0; i < input.length; i += 2) { // za da vzema po 2 elementa
                int quantity = Integer.parseInt(input[i]); //ednovremenno
                String item = (input[i + 1]).toLowerCase();

                if (keyMaterials.containsKey(item)) {
                    keyMaterials.putIfAbsent(item, 0);
                    int newQuantity = keyMaterials.get(item) + quantity;
                    keyMaterials.put(item, newQuantity);

                    if (keyMaterials.get(item) >= 250) {
                        int legendaryQuantity = keyMaterials.get(item) - 250;
                        keyMaterials.put(item, legendaryQuantity);
                        switch (item) {
                            case "shards":
                                System.out.println("Shadowmourne obtained!");
                                break;
                            case "fragments":
                                System.out.println("Valanyr obtained!");
                                break;
                            case "motes":
                                System.out.println("Dragonwrath obtained!");
                                break;
                        }
                        isObtained = true;
                        break;
                    }
                } else {
                    junk.putIfAbsent(item, 0);
                    int newQuantity = junk.get(item) + quantity;
                    junk.put(item, newQuantity);
                }
            }
        }
        keyMaterials.entrySet().stream()
                .sorted((a, b) -> {
                    int result = b.getValue().compareTo(a.getValue());
                    if (result == 0){
                        result = a.getKey().compareTo(b.getKey());
                    }
                    return result;
                })
                .forEach(element -> System.out.printf("%s: %d%n",
                        element.getKey(), element.getValue()));

        junk.entrySet().stream()
                .sorted((a2, b2) -> a2.getKey().compareTo(b2.getKey()))
                .forEach(junkItem -> System.out.printf("%s: %d%n",
                        junkItem.getKey(), junkItem.getValue()));
    }
}
