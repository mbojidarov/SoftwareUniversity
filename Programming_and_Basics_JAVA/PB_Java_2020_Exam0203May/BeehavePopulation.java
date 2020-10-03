import java.util.Scanner;

public class BeehavePopulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startPopulation = Integer.parseInt(scanner.nextLine());
        int years = Integer.parseInt(scanner.nextLine());
        int count5 = 0;

        for (int i = 1; i <= years; i++) {
            count5++;
            if (!(count5 == 5)){
                startPopulation = startPopulation + (startPopulation / 10 * 2);
                startPopulation = startPopulation - (startPopulation / 20 * 2);
            }else if (count5 == 5){
                startPopulation = startPopulation + (startPopulation / 10 * 2);
                startPopulation = startPopulation - (startPopulation / 50 * 5);
                startPopulation = startPopulation - (startPopulation / 20 * 2);
                count5 = 0;
            }

        }
        System.out.printf("Beehive population: %d", startPopulation);
    }
}
