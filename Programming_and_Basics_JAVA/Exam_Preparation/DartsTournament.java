import java.util.Scanner;

public class DartsTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startPoints = Integer.parseInt(scanner.nextLine());
        int count = 0;
        boolean isBull = false;

        while (startPoints > 0){
            count++;
            String sector = scanner.nextLine();
            if ("bullseye".equals(sector)){
                isBull = true;
                break;
            }
            int currentPoints = Integer.parseInt(scanner.nextLine());
            switch (sector){
                case "number section" :
                    startPoints = startPoints - currentPoints;
                    break;
                case "double ring":
                    startPoints = startPoints - currentPoints * 2;
                    break;
                case "triple ring":
                    startPoints = startPoints - currentPoints * 3;
                    break;
            }

        }
        if (isBull){
            System.out.printf("Congratulations! You won the game with a bullseye in %d moves!", count);

        }else if (startPoints < 0){
            System.out.printf("Sorry, you lost. Score difference: %d.", Math.abs(startPoints));

        }else{  // startPoints == 0
            System.out.printf("Congratulations! You won the game in %d moves!", count);
        }
    }
}
