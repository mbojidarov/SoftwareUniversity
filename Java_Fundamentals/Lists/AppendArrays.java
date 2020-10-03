import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        // 1 2 3,  4 5 6, _ 7 8
        String[] parts = input.split("\\|");
        List<String> elementsList = new ArrayList<>();

        for (int i = parts.length - 1; i >= 0 ; i--) {

            String[] tempNums = parts[i].split("\\s+");

            for (String num : tempNums) {
                if (!"".equals(num)){
                    elementsList.add(num);
                }
            }
        }
        System.out.print(String.join(" ", elementsList));
    }
}
