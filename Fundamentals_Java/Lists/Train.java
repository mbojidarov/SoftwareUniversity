import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Integer> train = Arrays.stream(input.split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxPassengers = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        while (!"end".equals(command)) {
            String[] order = command.split(" ");
            if ("Add".equals(order[0])) {
                int waggon = Integer.parseInt(order[1]);
                train.add(waggon);
            } else {
                int currentPassengers = Integer.parseInt(order[0]);

                for (int i = 0; i < train.size(); i++) {
                    int totalPassengers = train.get(i) + currentPassengers;

                    if (totalPassengers <= maxPassengers) {
                        train.set(i, totalPassengers);
                        i = - 1;
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (Integer waggon : train) {
            System.out.print(waggon + " ");
        }
    }
}
