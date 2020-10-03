import java.util.*;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nums = scanner.nextLine();

        List<Integer> numbers = Arrays.stream(nums.split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
                 // e -> Integer.parseInt(p)
        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size() - 1){
                break;
            }
            int currentNum = numbers.get(i);
            int lastNum = numbers.get(numbers.size() - 1);

            numbers.set(i, currentNum + lastNum);
            numbers.remove(numbers.size() - 1);
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

//        List<Integer> output = new ArrayList<>();
//        
//        for (int i = 0; i < numbers.size() / 2; i++) {
//            int currentSum = numbers.get(i) + numbers.get(numbers.size()- 1);
//            output.add(currentSum);
//        }
//        for (Integer num : output) {
//            if (numbers.size() % 2 != 0) {
//                System.out.println(output + " " + numbers.get(numbers.size() / 2));
//            } else {
//                System.out.println(output);
//            }
//        }
    }
}
