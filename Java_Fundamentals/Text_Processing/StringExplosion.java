import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder afterBombs = new StringBuilder();
        int power = 0;

        for (int i = 0; i < input.length(); i++) {
           char current = input.charAt(i);

           if (current == '>'){
               power = power + Integer.parseInt(String.valueOf(input.charAt(i + 1)));
               afterBombs.append('>');
           }else if (power == 0){
               afterBombs.append(current);
           }else{
               power--;
           }
        }
        System.out.println(afterBombs);
    }
}
