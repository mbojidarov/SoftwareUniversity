import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String digitRegex = "\\d";
        String letterRegex = "[A-Za-z]";

        Pattern digitPatern = Pattern.compile(digitRegex);
        Pattern letterPatern = Pattern.compile(letterRegex);

//        List<String> participants = new ArrayList<>();
//        String[] input = scanner.nextLine().split(", ");
//        for (String s : input) {
//            participants.add(s);
//        }
        List<String> participants2 = Arrays.stream(scanner.nextLine()
                .split(", ")).collect(Collectors.toList());

        Map<String, Integer> race = new LinkedHashMap<>();

        String inputSymbols = scanner.nextLine();

        while (!"end of race".equals(inputSymbols)) {
            Matcher letterMatcher = letterPatern.matcher(inputSymbols);
            StringBuilder sb = new StringBuilder();
            while (letterMatcher.find()) {
                sb.append(letterMatcher.group());
            }
            if (participants2.contains(sb.toString())) {
                race.putIfAbsent(sb.toString(), 0);
                int km = race.get(sb.toString());

                Matcher digitMatcher = digitPatern.matcher(inputSymbols);
                while (digitMatcher.find()) {
                    km = km + Integer.parseInt(digitMatcher.group());
                }
                race.put(sb.toString(), km);
            }
            inputSymbols = scanner.nextLine();
        }
        List<String> output = new ArrayList<>();
        output.add("1st place: ");
        output.add("2nd place: ");
        output.add("3rd place: ");

        race.
                entrySet()
                .stream()
                .sorted((km1, km2) -> km2.getValue().compareTo(km1.getValue()))
                .limit(3)
                .forEach(racer ->{
                    System.out.println(output.remove(0) + racer.getKey());
                        });
    }
}
