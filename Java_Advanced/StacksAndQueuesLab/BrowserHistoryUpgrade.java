import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> backHistoryStack = new ArrayDeque<>();
        ArrayDeque<String> forwardHistoryQueue = new ArrayDeque<>();
        String input = scanner.nextLine();
        String current = "";

        while (!"Home".equals(input)){
            if ("back".equals(input)) {
                if (backHistoryStack.isEmpty()) {
                    System.out.println("no previous URLs");
                    input = scanner.nextLine();
                    continue;
                } else {
                    forwardHistoryQueue.offer(current);
                    current = backHistoryStack.pop();
                }
            }else if ("forward".equals(input)){
                if (forwardHistoryQueue.isEmpty()){
                    System.out.println("no next URLs");
                    input = scanner.nextLine();
                    continue;
                }else{
                    backHistoryStack.push(current);
                    current = forwardHistoryQueue.poll();
                }

            }else {
                if (!current.isEmpty()){
                    backHistoryStack.push(current);
                    forwardHistoryQueue.clear();
                }
                current = input;
            }
            System.out.println(current);

            input = scanner.nextLine();
        }
    }
}
