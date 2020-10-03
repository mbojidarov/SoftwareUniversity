import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String inputOne = scanner.nextLine();
        List<Integer> first = Arrays.stream(inputOne.split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String inputTwo = scanner.nextLine();
        List<Integer> second = Arrays.stream(inputTwo.split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (!first.isEmpty() && !second.isEmpty()){

                int currentFirst = first.get(0);
                int currentSecond = second.get(0);

                first.remove(0);
                second.remove(0);

                if (currentFirst > currentSecond){
                    first.add(Integer.valueOf(currentFirst));
                    first.add(Integer.valueOf(currentSecond));

                }else if (currentFirst < currentSecond){
                    second.add(Integer.valueOf(currentSecond));
                    second.add(Integer.valueOf(currentFirst));
                }
        }
        int sum = 0;
        if (!first.isEmpty()){
            for (Integer num : first) {
                sum = sum + num;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }
        if (!second.isEmpty()){
            for (Integer num2 : second) {
                sum = sum + num2;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }
}
