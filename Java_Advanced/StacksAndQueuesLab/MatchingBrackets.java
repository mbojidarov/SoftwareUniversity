import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> brackets = new ArrayDeque<>();
        String input = scanner.nextLine(); //1 + (2 - (2 + 3) * 4 / (3 + 1)) * 5

        for (int i = 0; i < input.length(); i++) {
//            char currentSymbol = input.charAt(i);
//            if (currentSymbol == '(')
//                brackets.push(i); // za ArrayDeque<Integer>

            if (String.valueOf(input.charAt(i)).equals("(")){
                brackets.push(String.valueOf(i));

            }else if (String.valueOf(input.charAt(i)).equals(")")){
                int startBracketIndex = Integer.parseInt(brackets.pop());
                int closeIndex = i + 1;
                System.out.println(input.substring(startBracketIndex, closeIndex));
            }
        }
    }
}
