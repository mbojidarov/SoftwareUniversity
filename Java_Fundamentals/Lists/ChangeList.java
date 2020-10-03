import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Integer> elements = Arrays.stream(input.split("\\s+"))
                .map(Integer::parseInt)
                        .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!"end".equals(command)){
            String[] orders = command.split("\\s+");
            int element = Integer.parseInt(orders[1]);
            switch (orders[0]){
                case "Delete":
                    while (elements.contains(element)){
                        elements.remove(Integer.valueOf(element));
                    }
//                    for (int i = 0; i < elements.size(); i++) {
//                        if (elements.get(i) == element){
//                            i = i - 1;
//                        }
//                        elements.remove(Integer.valueOf(element));
//                    }
                    break;
                case "Insert":
                        int index = Integer.parseInt(orders[2]);
                        if (index >= 0 && index < elements.size()){
                            elements.add(index, element);
                        }
                    break;
            }
            command = scanner.nextLine();
        }
        for (Integer element : elements) {
            System.out.print(element + " ");
        }
    }
}
