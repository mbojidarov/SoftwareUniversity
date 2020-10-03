import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> binaryStack = new ArrayDeque<>();

        if (number == 0){
            System.out.println(number);
        }else{
            while (number != 0){
               binaryStack.push(number % 2);
                number /=  2;
            }
        }
        while (!binaryStack.isEmpty()){    //binaryStack.size > 0
            System.out.print(binaryStack.pop());
        }
    }
}
