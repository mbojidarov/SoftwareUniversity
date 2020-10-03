import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int target = 10000;
        int totalSteps = 0;
        int steps = 0;
        boolean isReached = false;

        String input = scanner.nextLine();

        while (!"Going home".equals(input)){
            steps = Integer.parseInt(input);
            totalSteps += steps;

            if (totalSteps >=target){
                isReached = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (isReached){
            System.out.println("Goal reached! Good job!");
        }else{
            steps = Integer.parseInt(scanner.nextLine());
            totalSteps += steps;
            int stepsNeeded = target - totalSteps;
            if (totalSteps >= target){
                System.out.println("Goal reached! Good job!");
            }else {
                System.out.printf("%d more steps to reach goal.", stepsNeeded);
            }
        }

 //      ВТОРО РЕШЕНИЕ:
//        int allSteps = 0;
//
//        while (allSteps < 10000){
//            String inputSteps = scanner.nextLine();
//            if ("Going home".equals(inputSteps)){
//                int toHomesteps = Integer.parseInt(scanner.nextLine());
//                allSteps = allSteps + toHomesteps;
//                break;
//            }
//            int currentSteps = Integer.parseInt(inputSteps);
//            allSteps = allSteps + currentSteps;
//        }
//            if (allSteps >= 10000){
//                System.out.println("Goal reached! Good job!");
//            } else {
//                int diff = 10000 - allSteps;
//                System.out.printf("%d more steps to reach goal.", diff);
//            }

    }
}

