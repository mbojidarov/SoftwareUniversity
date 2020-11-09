package TrafficLights;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] inputLights = scanner.nextLine().split("\\s+");

        List<TrafficLight> trafficLightsMachine = new ArrayList<>();

        for (String lights : inputLights) {
            TrafficLight trafficLight = new TrafficLight(Lights.valueOf(lights));

            trafficLightsMachine.add(trafficLight);
        }
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            for (TrafficLight trafficLight : trafficLightsMachine) {
                trafficLight.updateLightColors();
                System.out.print(trafficLight.getLight() + " ");
            }
            System.out.println();
        }
    }
}
