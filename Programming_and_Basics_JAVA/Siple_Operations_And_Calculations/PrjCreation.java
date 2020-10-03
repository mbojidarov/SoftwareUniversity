import java.util.Scanner;

public class PrjCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int prjCount = Integer.parseInt(scanner.nextLine());
        int prjHours = prjCount * 3;


        System.out.printf("The architect %s will need %d hours to complete %d project/s."
                                        , name, prjHours, prjCount);




    }

}
