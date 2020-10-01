import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int lenght = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int area = width * lenght * height;

        String input = scanner.nextLine();

        while (!"Done".equals(input)){

            int boxes = Integer.parseInt(input);
            area = area - boxes;

            if (area < 0){
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(area));
                break;
            }
            input = scanner.nextLine();
        }
        if (area >= 0){
            System.out.printf("%d Cubic meters left.", area);
        }
    }
}
