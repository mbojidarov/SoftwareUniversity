import java.util.*;

public class NikuldenMeals07122019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> likedMeals = new LinkedHashMap<>();
        Map<String, List<String>> unlikedMeals = new LinkedHashMap<>();
        int count = 0;

        while (!"Stop".equals(input)) {
            String[] parts = input.split("-");
            String command = parts[0];
            String guestName = parts[1];
            String meal = parts[2];

            switch (command) {
                case "Like":
                    likedMeals.putIfAbsent(guestName, new ArrayList<>());
                    if (!likedMeals.get(guestName).contains(meal)) {
                        likedMeals.get(guestName).add(meal);
                    }
                    break;

                case "Unlike":
                    unlikedMeals.putIfAbsent(guestName, new ArrayList<>());
                    unlikedMeals.get(guestName).add(meal);

                    if (!likedMeals.containsKey(guestName)) {
                        System.out.printf("%s is not at the party.%n", guestName);
                    } else {
                        if (!likedMeals.get(guestName).contains(meal)) {
                            System.out.printf("%s doesn't have the %s in his/her collection.%n",
                                    guestName, meal);
                        }else{   //likedMeals.get(guestName).contains(meal)
                            System.out.printf("%s doesn't like the %s.%n",
                                    guestName, meal);
                            likedMeals.get(guestName).remove(meal);
                            count++;
                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }
//   Работи само ако е new TreeMap<>()!!!
//        likedMeals.entrySet().stream()
//                .sorted((g1, g2) -> Integer.compare(g2.getValue().size(), g1.getValue().size()))
//                .forEach(guest -> System.out.printf("%s: %s%n",
//                        guest.getKey(),
//                        guest.getValue().toString().replaceAll("[\\[\\]]", "")));

        likedMeals.entrySet().stream()
                .sorted((e1, e2) -> {
                    int result = Integer.compare(e2.getValue().size(), e1.getValue().size());
                    if (result == 0){
                        result = e1.getKey().compareTo(e2.getKey());
                    }
                    return result;
                })
                .forEach(guest -> System.out.printf("%s: %s%n",
                        guest.getKey(),
                        guest.getValue().toString().replaceAll("[\\[\\]]", "")));

        System.out.printf("Unliked meals: %d%n", count);
    }
}
