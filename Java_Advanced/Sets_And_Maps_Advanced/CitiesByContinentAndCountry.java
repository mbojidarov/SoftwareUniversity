import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, LinkedHashMap<String, ArrayList<String>>> atlas = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = Arrays.stream(scanner.nextLine().split("\\s+")).toArray(String[]::new);
            String continent = input[0];
            String country = input[1];
            String city = input[2];

            atlas.putIfAbsent(continent, new LinkedHashMap<>());
            atlas.get(continent).putIfAbsent(country, new ArrayList<>());
            atlas.get(continent).get(country).add(city);

            // IF() ELSE() put in Map
//            if (!atlas.containsKey(continent)){
//                atlas.put(continent, new LinkedHashMap<>());
//                atlas.get(continent).put(country, new ArrayList<>());
//                atlas.get(continent).get(country).add(city);
//            }else{
//                if (!atlas.get(continent).containsKey(country)){
//                    atlas.get(continent).put(country, new ArrayList<>());
//                }else{
//                    atlas.get(continent).get(country).add(city);
//                }
//            }

        }
        atlas.entrySet().stream()
                .forEach(cont -> {
                    System.out.println(cont.getKey() + ":");
                    cont.getValue().entrySet().stream()
                            .forEach(coun -> {
                                System.out.println(coun.getKey() + " -> "
                                        + String.join(", ", coun.getValue()));
                            });
                });
    }
}
