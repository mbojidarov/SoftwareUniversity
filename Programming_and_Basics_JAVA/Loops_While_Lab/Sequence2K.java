import java.util.Scanner;

public class Sequence2K {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int output = 1;
        while (output <= input){
            System.out.println(output);
            output = output * 2 + 1;
        }
    }
}
