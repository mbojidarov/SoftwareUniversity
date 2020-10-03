import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "([=]|[\\/])(?<destination>[A-Z][A-Za-z]{2,})\\1";

        Pattern pattern = Pattern.compile(regex);
        String inputText = scanner.nextLine();
        Matcher matcher = pattern.matcher(inputText);

        List<String> destinations = new ArrayList<>();
        int pointsCount = 0;
        while (matcher.find()){
            String singlePoint = matcher.group("destination");
            pointsCount = pointsCount + singlePoint.length();
            destinations.add(singlePoint);
        }
        System.out.print("Destinations: ");
        System.out.println(destinations.toString()
                .replaceAll("[\\[\\]]", ""));
        System.out.println(String.format("Travel Points: %d", pointsCount));
    }
}
