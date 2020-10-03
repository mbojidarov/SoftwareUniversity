import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> parking = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String [] parts = scanner.nextLine().split("\\s+");
            String command = parts[0];
            String username = parts[1];

            switch (command){
                case "register":
                    String plateNumber = parts[2];
                    if (parking.containsKey(username)){
                        System.out.printf("ERROR: already registered with plate number %s%n",
                                parking.get(username));
                    }else{
                        parking.put(username, plateNumber);
                        System.out.printf("%s registered %s successfully%n",
                                username, plateNumber);
                    }
                    break;
                case "unregister":
                    if (parking.containsKey(username)){
                        System.out.printf("%s unregistered successfully%n",
                                username);
                        parking.remove(username);
                    }else{
                        System.out.printf("ERROR: user %s not found%n",
                                username);
                    }
                    break;
            }
        }
        for (Map.Entry<String, String> entry : parking.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
