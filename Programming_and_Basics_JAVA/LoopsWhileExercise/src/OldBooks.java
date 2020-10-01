import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bookToSearch = scanner.nextLine();
        int libCapacity = Integer.parseInt(scanner.nextLine());
        int count = 0;
        boolean isFound = false;

        while (count < libCapacity) {
            String currentBook = scanner.nextLine();
            if (bookToSearch.equals(currentBook)) {
                isFound = true;
                break;
            }
            count++;
        }
        if (isFound == true) {
            System.out.printf("You checked %d books and found it.", count);
        } else {
            System.out.printf("The book you search is not here!%n" +
                    "You checked %d books.", count);
        }
    }
}
