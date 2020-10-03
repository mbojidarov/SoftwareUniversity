import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int repeatN = Integer.parseInt(scanner.nextLine());

        String result = getRepeatedString(input, repeatN);
        System.out.println(result);
    }

    private static String getRepeatedString(String input, int repeatN) {
        String[]repeatStr = new String[repeatN];
        for (int i = 0; i < repeatStr.length; i++) {
            repeatStr[i] = input;
        }
            return String.join("", repeatStr);

//
//        String resultString = "";
//        for (int i = 0; i < repeatN; i++) {
//            resultString = resultString + input;
//        }
//        return resultString;


    }
}
