import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());
        double evenCheck = inputNum % 2;
        double fiveCheck = inputNum % 10;
        double bonus = 0;
        double bonus2 = 0;

        if (inputNum <=100) {
            bonus = bonus + 5;              //20 0+5
        } else if (inputNum > 1000) {
            bonus = inputNum * 0.1;
        } else {
            bonus = inputNum * 0.2;         //175 35
        }
        if (evenCheck == 0) {
            bonus2 = bonus + 1;             //20 5+1
        } else if (fiveCheck == 5) {
            bonus2 = bonus + 2;             //175 35+2
        } else {
            bonus2 = bonus;
        }
            System.out.println(bonus2);
            System.out.println(inputNum + bonus2);

        }

    }
