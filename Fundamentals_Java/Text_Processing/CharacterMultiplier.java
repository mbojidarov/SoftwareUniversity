import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        String first = input[0];
        String second = input[1];

        int minLen = Math.min(first.length(), second.length());
        int maxLen = Math.max(first.length(), second.length());
        int totalResult = 0;

        for (int i = 0; i < maxLen; i++) {
            if (i < minLen){
                totalResult = totalResult + (first.charAt(i) * second.charAt(i));
            }else if (first.length() == maxLen){
                totalResult = totalResult + first.charAt(i);
            }else{
                totalResult = totalResult + second.charAt(i);
            }
        }
        System.out.println(totalResult);
    }
}
