import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputRobot = scanner.nextLine().split(";");

        LinkedHashMap<String, Integer> robots = new LinkedHashMap<>();
        for (int i = 0; i < inputRobot.length; i++) {
            String nameRobot = inputRobot[i].split("-")[0];
            int timeRobot = Integer.parseInt(inputRobot[i].split("-")[1]);
            robots.put(nameRobot, timeRobot);
        }

        String startTime = scanner.nextLine();  //  [08:00:00]
        int startHour = Integer.parseInt(startTime.split(":")[0]);
        int startMinutes = Integer.parseInt(startTime.split(":")[1]);
        int startSeconds = Integer.parseInt(startTime.split(":")[2]);
        long totalTimeInSeconds = startHour * 3600 + startMinutes * 60 + startSeconds;

        ArrayDeque<String> queueProducts = new ArrayDeque<>();
        int[] workingTime = new int[robots.size()];

        String product = scanner.nextLine();

        while (!"End".equals(product)) {
            queueProducts.offer(product);
            product = scanner.nextLine();
        }
        while (!queueProducts.isEmpty()) {
            String currentProduct = queueProducts.poll();
                                             //uvelichavane tekushto vreme
            totalTimeInSeconds++;
            boolean isTaken = false;
                                            //namalqvam s 1 sec rabotnoto vreme
            for (int robot = 0; robot < workingTime.length; robot++) {
                if (workingTime[robot] > 0) {
                    --workingTime[robot];
                }
            }
                                            //ROB - detail [08:00:01]
                                             //robot is free
            for (int i = 0; i < workingTime.length; i++) {
                if (workingTime[i] == 0) {
                    int count = 0;
                    for (Map.Entry<String, Integer> robot : robots.entrySet()) {
                        if (count == i) {
                            workingTime[i] = robot.getValue();
//                                          totalTimeInSeconds v chasove min i sec
                            long takenHour = totalTimeInSeconds / 3600 % 24;
                            long takenMinute = totalTimeInSeconds % 3600 / 60;
                            long takenSeconds = totalTimeInSeconds % 60;
                            System.out.printf("%s - %s [%02d:%02d:%02d]%n",
                                    robot.getKey(), currentProduct,
                                    takenHour, takenMinute, takenSeconds);
                            isTaken = true;
                            break;
                        }
                        count++;
                    }
                    break;
                }
            }
            if (!isTaken) {
                queueProducts.offer(currentProduct);
            }
        }
    }
}
