import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> hotCircle = new ArrayDeque<>();
        for (String kid : input) {
            hotCircle.offer(kid);
        }
        while (hotCircle.size() > 1){

            for (int i = 1; i < n; i++) {
                    hotCircle.offer(hotCircle.poll());

            }
            System.out.println("Removed "+ hotCircle.poll());
        }
            System.out.println("Last is " + hotCircle.peek());
        }
    }
