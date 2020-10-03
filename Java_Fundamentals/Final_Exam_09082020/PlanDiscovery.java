import java.util.*;

public class PlanDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> rarityMap = new LinkedHashMap<>();
        Map<String, List<Double>> ratingMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] plantsRarity = scanner.nextLine().split("<->");
            String name = plantsRarity[0];
            int rare = Integer.parseInt(plantsRarity[1]);

            rarityMap.put(name, rare);
        }
        String secondInput = scanner.nextLine();
        while (!"Exhibition".equals(secondInput)) {
            String[] parts = secondInput.split("\\s+");
            String command = parts[0];
            String plantName = parts[1];
            // double rating = Double.parseDouble(parts[3]);

            switch (command) {
                case "Rate:": //store all ratings
                    double rating = Double.parseDouble(parts[3]);
                    ratingMap.put(plantName, new ArrayList<>());
                    ratingMap.get(plantName).add(rating);
                    break;
                case "Update:": //new rarity
                    rating = Double.parseDouble(parts[3]);
                    int newRarity = Integer.parseInt(parts[3]);
                    rarityMap.put(plantName, newRarity);
                    break;
                case "Reset:": //remove all ratings for a plant
                    ratingMap.remove(plantName);
                    break;
                default:
                    System.out.println("error");
            }
            secondInput = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        rarityMap
                .entrySet()
                .stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .forEach(plant -> {
                    //- Woodii; Rarity: 5; Rating: 7.50
                    System.out.printf("- %s; Rarity: %d; ", plant.getKey(), plant.getValue());
                    ratingMap
                            .entrySet()
                            .stream()
                            .sorted((a, b) -> {
                                double plant1 = a.getValue().stream()
                                        .mapToDouble(Double::doubleValue).average().orElse(0);
                                double plant2 = b.getValue().stream()
                                        .mapToDouble(Double::doubleValue).average().orElse(0);
                                return Double.compare(plant2, plant1);
                            })
                            .forEach(p ->
                                    System.out.printf("Rating: %.2f%n",
                                            p.getValue().stream()
                                                    .mapToDouble(Double::doubleValue).average().orElse(0)));
                });
    }
}
