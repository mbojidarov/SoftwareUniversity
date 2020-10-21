import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int count = 0;
        String goods = "";
        int quantity = 0;

        Map<String, Integer> mine = new LinkedHashMap<>();

        while (!"stop".equals(input)){
            count++;
            if (count % 2 != 0){
                goods = input;
                mine.putIfAbsent(goods, 0);
            }else{
                quantity = Integer.parseInt(input);
                mine.put(goods, mine.get(goods) + quantity);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : mine.entrySet()) {
            System.out.println(entry.getKey() +" -> " + entry.getValue());
        }
    }
}
