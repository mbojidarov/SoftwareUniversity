import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stackHistory = new ArrayDeque<>();
        String input = scanner.nextLine();
        String current = "";

        while (!"Home".equals(input)){
            if ("back".equals(input)){
                if (stackHistory.isEmpty()){
                    System.out.println("no previous URLs");
                    input = scanner.nextLine();
                    continue;
                }else {
                   current = stackHistory.pop();
                }
            }else {
                if (!current.isEmpty()){
                    stackHistory.push(current);
                }
                current = input;
            }
            System.out.println(current);

            input = scanner.nextLine();
        }
    }
}
