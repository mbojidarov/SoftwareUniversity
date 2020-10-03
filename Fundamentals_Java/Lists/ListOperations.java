import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String elements = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(elements.split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!"End".equals(input)){
            String[] command = input.split("\\s+");
            switch (command[0]){
                case "Add":
                    numbers.add(Integer.valueOf(command[1]));
                    break;
                case "Insert":
                    int num = Integer.parseInt(command[1]);
                    int index = Integer.parseInt(command[2]);
                    if (index < 0 || index > numbers.size() -1){
                        System.out.println("Invalid index");
                    }else{
                        numbers.add(index, num);
                    }
                    break;
                case "Remove":
                    int index2 = Integer.parseInt(command[1]);
                    if (index2 < 0 || index2 > numbers.size() -1){
                        System.out.println("Invalid index");
                    }else{
                        numbers.remove(index2);
                    }
                    break;
                case "Shift":
                    int count = Integer.parseInt(command[2]);
                    int currentNum = 0;
                    if ("left".equals(command[1]))
                        for (int i = 0; i < count; i++) {
                            currentNum = numbers.get(0);
                            numbers.remove(0);
                            numbers.add(Integer.valueOf(currentNum));
                        }else{  // right
                        for (int i = 0; i < count; i++) {
                            currentNum = numbers.get(numbers.size() - 1);
                            numbers.remove(numbers.size() - 1);
                            numbers.add(0, Integer.valueOf(currentNum));
                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
