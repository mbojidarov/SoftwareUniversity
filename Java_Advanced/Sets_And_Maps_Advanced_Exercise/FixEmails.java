import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int count = 0;
        String names = "";
        String emails = "";

        Map<String, String> data = new LinkedHashMap<>();

        while (!"stop".equals(input)){
            count++;
            if (count % 2 != 0){
                names = input;
            }else{
                emails = input;
                String[]  check = emails.split("\\.");

                if (check[1].equals("bg")){
                    data.put(names, emails);
                }
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, String> entry : data.entrySet()) {
            System.out.println(entry.getKey() +" -> " + entry.getValue());
        }
    }
}
