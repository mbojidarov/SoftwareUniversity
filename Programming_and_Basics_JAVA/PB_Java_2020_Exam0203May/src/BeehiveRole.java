import java.util.Scanner;

public class BeehiveRole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int intellect = Integer.parseInt(scanner.nextLine());
            int strength = Integer.parseInt(scanner.nextLine());
            String gender = scanner.nextLine();

            if (intellect >= 80 && strength >=80 && "female".equals(gender)){
                System.out.print("Queen Bee");
            }else if (intellect >= 80){
                System.out.print("Repairing Bee");
            }else if (intellect >= 60){
                System.out.print("Cleaning Bee");
            }else if (strength >= 80 && "male".equals(gender)){
                System.out.print("Drone Bee");
            }else if (strength >= 60){
                System.out.print("Guard Bee");
            }else{
                System.out.print("Worker Bee");
            }
    }
}
