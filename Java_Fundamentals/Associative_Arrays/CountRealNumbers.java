import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        Map<Double, Integer> numbers = new TreeMap<>();

        for (String num : input) {
            double currentNum = Double.parseDouble(num);
            if (numbers.containsKey(currentNum)){
                //Integer count = numbers.get(currentNum);
                numbers.put(currentNum, numbers.get(currentNum) + 1);
            }else{
                numbers.put(currentNum, 1);
            }
        }
        DecimalFormat decimalF = new DecimalFormat("#.#######");
        for (Map.Entry<Double, Integer> entry : numbers.entrySet()) {
            System.out.printf("%s -> %d%n",
                    decimalF.format(entry.getKey()), entry.getValue());
//            System.out.println(decimalF.format(entry.getKey()) + " -> " +
//                    entry.getValue());
        }
    } 
}
