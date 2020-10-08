import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputRobot = scanner.nextLine().split(";");

        Map<String, Integer> robots = new LinkedHashMap<>();
        for (int i = 0; i < inputRobot.length; i++) {
            String [] currentRobot = inputRobot[i].split("-");
            robots.put(currentRobot[0],Integer.parseInt(currentRobot[1]));
        }

        String [] Time = (scanner.nextLine().split(":"));
        int StartHour = Integer.parseInt(Time[0]);
        int StartMinutes = Integer.parseInt(Time[1]);
        int StartSeconds = Integer.parseInt(Time[2]);

        ArrayDeque<String> queueProducts = new ArrayDeque<>();

        String product = scanner.nextLine();

        while (!"End".equals(product)){
//            Starting time + 01 sec
            if (!isFreeRobot()){
                queueProducts.offer(product);
            }else{
                System.out.println(nameRobot - product [startingTime]);
            }


            product = scanner.nextLine();
        }
    }
}
