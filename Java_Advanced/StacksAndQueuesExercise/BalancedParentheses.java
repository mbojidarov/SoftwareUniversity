import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<Character> openBracketsStack = new ArrayDeque<>();
        boolean areBalanced = true;

        for (int i = 0; i < input.length(); i++) {
            char currentBracket = input.charAt(i);

            if (currentBracket == '{' || currentBracket == '[' || currentBracket == '('){
                openBracketsStack.push(currentBracket);
            }else if (currentBracket == '}' || currentBracket == ']' || currentBracket == ')'){

                if (!openBracketsStack.isEmpty()){
                    char openBracket = openBracketsStack.pop();
                    if (currentBracket == '}' && openBracket != '{'){
                        areBalanced = false;
                    }else if (currentBracket == ']' && openBracket != '['){
                        areBalanced = false;
                    }else if (currentBracket == ')' && openBracket != '('){
                        areBalanced = false;
                    }
                }else{            // the stack is empty
                    areBalanced = false;
                }
            }
        }
        if (areBalanced){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
