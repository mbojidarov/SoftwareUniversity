import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] parts = scanner.nextLine().split("\\s+");
        ArrayDeque<String> stackNumbers = new ArrayDeque<>();
//        for (String part : parts) {
//            stackNumbers.push(part);
//        }
        Collections.addAll(stackNumbers, parts);
        int sum = 0;

        while (stackNumbers.size() > 1){
            int firstNum = Integer.parseInt(stackNumbers.pop());
            String operation = stackNumbers.pop();
            int secondNum = Integer.parseInt(stackNumbers.pop());

            if (operation.equals("+")){
                sum = firstNum + secondNum;
                stackNumbers.push(String.valueOf(sum)); //Integer.toString(sum)
            }else if (operation.equals("-")){
                sum = firstNum - secondNum;
                stackNumbers.push(String.valueOf(sum)); //Integer.toString(sum)
            }
        }
        System.out.println(stackNumbers.peek());
    }
}
