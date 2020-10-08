import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> queueNumbers = new ArrayDeque<>();

        int numsToAdd = Integer.parseInt(input[0]);
        int numsToRemve = Integer.parseInt(input[1]);
        int numsToFind = Integer.parseInt(input[2]);

        String[] nums = scanner.nextLine().split("\\s+");

        for (int i = 0; i < numsToAdd; i++) {
            queueNumbers.offer(Integer.parseInt(nums[i]));
        }
        for (int i = 0; i < numsToRemve; i++) {
            queueNumbers.poll();
        }

        if (!queueNumbers.isEmpty()){
            if (queueNumbers.contains(numsToFind)){
                System.out.println("true");
            }else {
                System.out.println(findSmallestElement(queueNumbers));
                //  System.out.println(Collections.min(stackNums));  // 1 variant stream

                //   System.out.println(stackNums.stream().mapToInt(e->e).min().getAsInt());
                //                                                             .orElse(0); - nqma nujda ot validaciq
            }

        }else{ //is empty
            System.out.println(0);
        }
    }

    private static int findSmallestElement(ArrayDeque<Integer> queueNumbers) {
        int smallest = Integer.MAX_VALUE;
        for (int number : queueNumbers) {
            if (number < smallest){
                smallest = number;
            }
        }
        return smallest;
    }
}
