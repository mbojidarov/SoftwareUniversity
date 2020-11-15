package ShoppingSpree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//              Pesho=11;Gosho=4
//              Bread=10;Milk=2
//        List<Person> people = Arrays.stream(scanner.nextLine().split(";"))
//                .map(person -> {
//                    String[] parts = person.split("=");
//                    return new Person(parts[0], Double.parseDouble(parts[1]));
//                }).collect(Collectors.toList());

        Map<String, Person> people;
        Map<String, Product> foods;
        
        try{
            people = getPeople(scanner);
            foods = getFoods(scanner);
        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
            return;
        }

        String purchase = scanner.nextLine();

        while (!"END".equals(purchase)) {
            String[] parts = purchase.split("\\s+");
            String person = parts[0];
            String food = parts[1];

            buyFood(people, foods, person, food);

            purchase = scanner.nextLine();
        }
        for (Person person : people.values()) {
            System.out.println(person.toString());
        }
    }

    private static void buyFood(Map<String, Person> people, Map<String, Product> foods, String person, String food) {
        try {
            people.get(person).buyProduct(foods.get(food));
            System.out.println(person + " bought " + food);
        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static Map<String, Product> getFoods(Scanner scanner) {
        String[] parts = scanner.nextLine().split(";");
        Map<String, Product> foods = new LinkedHashMap<>();
        for (String part : parts) {
            String[] productInfo = part.split("=");

            Product product = new Product(productInfo[0], Double.parseDouble(productInfo[1]));

            foods.put(product.getName(), product);
        }
        return foods;
    }

    private static Map<String, Person> getPeople(Scanner scanner) {
        String[] parts = scanner.nextLine().split(";");
        Map<String, Person> people = new LinkedHashMap<>();
        for (String part : parts) {
            String[] peopleInfo = part.split("=");

            Person person = new Person(peopleInfo[0], Double.parseDouble(peopleInfo[1]));

            people.put(person.getName(), person);
        }
        return people;
    }
}
