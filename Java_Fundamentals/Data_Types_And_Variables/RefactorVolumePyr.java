import java.util.Scanner;

public class RefactorVolumePyr {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    double lenght, width, heigh = 0;
        lenght = Double.parseDouble(scanner.nextLine());
        width = Double.parseDouble(scanner.nextLine());
        heigh = Double.parseDouble(scanner.nextLine());
        System.out.print("Length: ");
        System.out.print("Width: ");
        System.out.print("Height: ");
    double volume = (lenght * width * heigh) / 3;
    System.out.printf("Pyramid Volume: %.2f", volume);
}
}

