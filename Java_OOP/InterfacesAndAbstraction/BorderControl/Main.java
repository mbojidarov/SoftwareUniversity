package BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Identifiable> idUnits = new ArrayList<>();

        String input = scanner.nextLine();
        while (!"End".equals(input)){
            String[] parts = input.split("\\s+");

            if (parts.length == 3){
                idUnits.add(new Citizen(parts[0], Integer.parseInt(parts[1]), parts[2]));
            }else {
                idUnits.add(new Robot(parts[0], parts[1]));
            }
            input = scanner.nextLine();
        }

        String fakeId = scanner.nextLine();
        checkFakeID(fakeId, idUnits);
    }

    private static void checkFakeID(String fakeId, List<Identifiable> idUnits) {
        for (Identifiable unit : idUnits) {
            if (unit.getId().endsWith(fakeId))
                System.out.println(unit.getId());
        }
    }
}
