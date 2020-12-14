import java.util.ArrayDeque;
import java.util.Scanner;

public class Scheduling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> taskStack = new ArrayDeque<>();
        ArrayDeque<Integer> threadQueue = new ArrayDeque<>();

        String[] inputTasks = scanner.nextLine().split(",\\s+");
        for (int i = 0; i < inputTasks.length; i++) {
            int currentTask = Integer.parseInt(inputTasks[i]);
            taskStack.push(currentTask);
        }
        String[] inputThreads = scanner.nextLine().split("\\s+");
        for (int i = 0; i < inputThreads.length; i++) {
            int currentThread = Integer.parseInt(inputThreads[i]);
            threadQueue.offer(currentThread);
        }

        int taskToKill = Integer.parseInt(scanner.nextLine());

        while (taskStack.contains(taskToKill)) {
            if (taskStack.peek() == taskToKill){
                taskStack.pop();
                continue;
            }
            if (!threadQueue.isEmpty() && !taskStack.isEmpty()) {
                int taskValue = taskStack.peek();
                int threadValue = threadQueue.peek();

                if (threadValue >= taskValue) {
                    if (taskStack.peek() == taskToKill){
                        taskStack.pop();
                        continue;
                    }
                    taskStack.pop();
                    threadQueue.poll();
                } else { //threadValue < taskValue){
                    threadQueue.poll();
                }
            }
        }
        System.out.printf("Thread with value %d killed task %d%n",
                threadQueue.peek(), taskToKill);

        while (!threadQueue.isEmpty()) {
            System.out.print(threadQueue.poll() + " ");
        }
    }
}
