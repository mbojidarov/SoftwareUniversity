import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!"end".equals(input)){
            String reverseInput = "";
            for (int i = input.length()-1; i >= 0; i--) {
                reverseInput = reverseInput + input.charAt(i);
            }
            System.out.printf("%s = %s%n", input, reverseInput);
            input = scanner.nextLine();
        }
//        String rev = new StringBuilder(input).reverse().toString();
//        System.out.println(rev);
    }
}
