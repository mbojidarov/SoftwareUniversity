import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FroggySquad30062019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputNames = scanner.nextLine();
        List<String> frogs = Arrays.stream(inputNames.split("\\s+"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        String[] temp = input.split("\\s+");

//        while (!"Print".equals(temp[0])) {
        while (true) {
            String[] parts = input.split("\\s+");
            String command = parts[0];

            switch (command) {
                case "Join":
                    if (!frogs.contains(parts[1])) {
                        frogs.add(parts[1]);
                    }
                    break;
                case "Jump":
                    int index1 = Integer.parseInt(parts[2]);
                    if (index1 < frogs.size()) {
                        frogs.add(index1, parts[1]);
                    }
                    break;
                case "Dive":
                    int index2 = Integer.parseInt(parts[1]);
                    if (index2 < frogs.size()) {
                        frogs.remove(index2);
                    }
                    break;
                case "First":
                    int firstCount = Integer.parseInt(parts[1]);
                    if (firstCount > frogs.size()) {
                        for (String frog : frogs) {
                            System.out.print(frog + " ");
                        }
                    } else {
                        for (int i = 0; i < firstCount; i++) {
                            System.out.print(frogs.get(i) + " ");
                        }
                    }
                    System.out.println();
                    break;
                case "Last":
                    int lastCount = Integer.parseInt(parts[1]);
                    if (lastCount > frogs.size()) {
                        for (String frog : frogs) {
                            System.out.print(frog + " ");
                        }
                    } else {
                        for (int i = frogs.size() - lastCount; i < frogs.size(); i++) {
                            System.out.print(frogs.get(i) + " ");
                        }
                    }
                    System.out.println();
                    break;
                case "Print":
                    if ("Normal".equals(parts[1])) {
                        System.out.print("Frogs: ");
                        System.out.print(String.join(" ", frogs));
                    } else if ("Reversed".equals(parts[1])) {
                        Collections.reverse(frogs);
                        System.out.print("Frogs: ");
                        System.out.print(String.join(" ", frogs));
                    }
                    return;

            }
            input = scanner.nextLine();
        }
//        String[] print = input.split("\\s+");
//        if ("Normal".equals(print[1])) {
//            System.out.print(String.join(" ", frogs));
//        } else if ("Reversed".equals(print[1])) {
//            Collections.reverse(frogs);
//            System.out.print(String.join(" ", frogs));
//        }
    }
}
