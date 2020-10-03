import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        double max = Double.MIN_VALUE;
        String biggestKeg = "";

        for (int i = 0; i < input; i++) {
            String modelKeg = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;
            if (volume > max){
                max = volume;
                biggestKeg = modelKeg;
            }
        }
        System.out.println(biggestKeg);
    }
}
