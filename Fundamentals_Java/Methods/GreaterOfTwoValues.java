import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        switch (input){
            case "int":
                int num1 = Integer.parseInt(first);
                int num2 = Integer.parseInt(second);
                System.out.println(getMax(num1, num2));
                break;
            case "char":
                char symbol1 = first.charAt(0);
                char symbol2 = second.charAt(0);
                System.out.println(getMax(symbol1, symbol2));
                break;
            case "string":
                System.out.println(getMax(first, second));
                break;
        }
    }

    private static void printResult(int nu) {
    }

    private static int getMax(int firstInt, int secondInt) {
        if (firstInt > secondInt){
            return firstInt;
        }else {
            return secondInt;
        }
    }
    private static char getMax(char one, char two){
        if (one > two){
            return one;
        }else{
            return two;
        }
    }
    private static String getMax(String edno, String dve){
        if (edno.compareTo(dve) > 0){
            return edno;
        }else{
            return dve;
        }
    }
}
