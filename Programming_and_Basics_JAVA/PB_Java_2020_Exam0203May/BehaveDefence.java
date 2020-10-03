import java.util.Scanner;

public class BehaveDefence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberBees = Integer.parseInt(scanner.nextLine());
        int healthBear = Integer.parseInt(scanner.nextLine());
        int attackBear = Integer.parseInt(scanner.nextLine());
        boolean isBearWon = false;

        while (healthBear > 0){
            numberBees = numberBees - attackBear;
            healthBear = healthBear - numberBees * 5;
            if (numberBees < 100){
                isBearWon = true;
                break;
            }
        }
        if (numberBees < 0){
            numberBees = 0;
        }
        if (isBearWon){
            System.out.printf("The bear stole the honey! Bees left %d.", numberBees);
        }else{
            System.out.printf("Beehive won! Bees left %d.", numberBees);
        }
    }
}
