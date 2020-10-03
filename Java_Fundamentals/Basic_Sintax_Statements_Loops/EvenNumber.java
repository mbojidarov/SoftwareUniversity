import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oddNumber = Integer.parseInt(scanner.nextLine());

        while (oddNumber % 2 != 0){
            System.out.println("Please write an even number.");
            oddNumber = Integer.parseInt(scanner.nextLine());
        }
        if (oddNumber < 0){
            oddNumber = oddNumber * -1;
        }
        System.out.println("The number is: " + oddNumber);
    }
}
