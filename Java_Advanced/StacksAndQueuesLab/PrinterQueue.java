import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> printerQueue = new ArrayDeque<>();
        String input = scanner.nextLine();

        while (!"print".equals(input)){

            if ("cancel".equals(input)){
                if (printerQueue.isEmpty()){  //empty
                    System.out.println("Printer is on standby");
                }else{   // not empty
                    System.out.printf("Canceled %s%n", printerQueue.poll());
                }
            }else{
                printerQueue.offer(input);
            }
            input = scanner.nextLine();
        }

        if ("print".equals(input)){         //bez if-a
            while (!printerQueue.isEmpty()){
                System.out.println(printerQueue.poll());
            }
        }
    }
}
