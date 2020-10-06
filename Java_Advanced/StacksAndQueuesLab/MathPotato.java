import java.util.ArrayDeque;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> mathCycle = new ArrayDeque<>();
        for (String kid : input) {
            mathCycle.offer(kid);
        }
        int cycle = 1;
        while (mathCycle.size() > 1){

            for (int i = 1; i < n; i++) {
                mathCycle.offer(mathCycle.poll());

            }
            if (isPrime(cycle)){
                System.out.println("Prime " + mathCycle.peek());
            }else{
                System.out.println("Removed "+ mathCycle.poll());
            }
            cycle++;
        }
        System.out.println("Last is " + mathCycle.peek());
    }

    private static boolean isPrime(int cycle) {

        if (cycle == 0 || cycle == 1){
            return false;
        }else{
            //condition for nonPrime number
            for (int i = 2; i <= cycle / 2; i++) {
                if (cycle % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
