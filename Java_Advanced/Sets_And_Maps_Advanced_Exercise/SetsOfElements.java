import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
       int setSizeOne = Integer.parseInt(input[0]);
       int setSizeTwo = Integer.parseInt (input[1]);

        LinkedHashSet <Integer> firstSet = new LinkedHashSet<>();
        LinkedHashSet <Integer> secondSet = new LinkedHashSet<>();

        for (int i = 0; i < setSizeOne; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            firstSet.add(currentNum);
        }
        for (int i = 0; i < setSizeTwo; i++) {
            int current = Integer.parseInt(scanner.nextLine());
            secondSet.add(current);
        }

        firstSet.retainAll(secondSet);  // Sravnqva elementite na first i second
                                    // ostavq v first samo tezi koito se POVTARQT

        firstSet.forEach(num -> System.out.println(num + " "));

//        for (Integer num : firstSet) {
//            if (secondSet.contains(num))
//                System.out.print(num + " ");
//        }
    }
}
