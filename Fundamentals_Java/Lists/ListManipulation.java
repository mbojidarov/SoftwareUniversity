import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        List<Integer> elements = new ArrayList<>();
        //Collections.addAll(elements, input);

        for (String num : input) {
            int current = Integer.parseInt(num);
            elements.add(current);
        }
        String command = scanner.nextLine();
        while (!"end".equals(command)) {
            String[] todo = command.split(" ");
            switch (todo[0]) {
                case "Add":
                    int part1 = Integer.parseInt(todo[1]);;
                    elements.add(part1);
                    break;
                case "Remove":
                    int part2 = Integer.parseInt(todo[1]);
                    elements.remove(Integer.valueOf(part2));
                    break;
                case "RemoveAt":
                    int part3 = Integer.parseInt(todo[1]);
                    elements.remove(part3);
                    break;
                case "Insert":
                    int part4 = Integer.parseInt(todo[1]); //Number
                    int part5 = Integer.parseInt(todo[2]); //index
                    elements.add(part5, part4);
                    break;
            }
            command = scanner.nextLine();
        }
 //       for (Integer element : elements) {
//            System.out.print(element + " ");
            System.out.println(elements.toString()
                    .replaceAll("[\\[\\],]", ""));
//        }
    }
}
