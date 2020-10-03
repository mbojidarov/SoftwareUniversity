import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = ">>(?<type>[A-Za-z]+)<<(?<price>\\d+\\.?\\d+)!(?<quantity>\\d+)";
        String inputText = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        double totalPrice = 0.0;

        List<String> furniture = new ArrayList<>();
        while (!"Purchase".equals(inputText)){
            Matcher matcher = pattern.matcher(inputText);
            if (matcher.find()){
                String type = matcher.group("type");
                double price = Double.parseDouble(matcher.group("price"));
                double quantity = Double.parseDouble(matcher.group("quantity"));
                totalPrice = totalPrice + (price * quantity);
                furniture.add(type);
            }
            inputText = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furniture.forEach(f -> System.out.println(f));
//        for (String type : furniture) {
//            System.out.println(type);
//        }
        System.out.println(String.format("Total money spend: %.2f", totalPrice));
    }
}
