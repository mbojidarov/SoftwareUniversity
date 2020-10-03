import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Integer> elements = Arrays.stream(input.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!"end".equals(command)) {
            String[] order = command.split(" ");
            String currentOrder = order[0];
            switch (currentOrder) {
                case "Contains":
                    if (elements.contains(Integer.parseInt(order[1]))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if ("even".equals(order[1])) {
                        for (int i = 0; i < elements.size(); i++) {
                            if (elements.get(i) % 2 == 0) {
                                System.out.print(elements.get(i) + " ");
                            }
                        }
                    } else {  //odd
                        for (int i = 0; i < elements.size(); i++) {
                            if (elements.get(i) % 2 != 0) {
                                System.out.print(elements.get(i) + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
                case "Get":
                    int sum = 0;
                    for (Integer element : elements) {
                        sum = sum + element;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    switch (order[1]){
                        case ">=":
                            for (Integer element : elements) {
                                if (element >= Integer.parseInt(order[2])){
                                    System.out.print(element + " ");
                                }
                            }
                            break;
                        case "<=":
                            for (Integer element : elements) {
                                if (element <= Integer.parseInt(order[2])){
                                    System.out.print(element + " ");
                                }
                            }
                            break;
                        case ">":
                            for (Integer element : elements) {
                                if (element > Integer.parseInt(order[2])){
                                    System.out.print(element + " ");
                                }
                            }
                            break;
                        case "<":
                            for (Integer element : elements) {
                                if (element < Integer.parseInt(order[2])){
                                    System.out.print(element + " ");
                                }
                            }
                            break;

                    }
                    System.out.println();
                    break;
            }


            command = scanner.nextLine();
//            System.out.println(elements.toString()
//                    .replaceAll("[\\[\\],]", ""));
//            System.out.println(Arrays.toString(order)
//                    .replaceAll("[\\[\\],]", ""));
        }
    }
}

