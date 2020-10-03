import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        String wordOne = input[0];
        String wordTwo = input[1];

        int tempPosNumLow = 96;
        int tempPosNumUpp = 64;
        int positionAlphabetic = 0;
        double totalResultOne = 0;
        double totalResultTwo = 0;

        int firstNumber = Integer.parseInt(wordOne.substring(1, wordOne.length() - 1));

        char firstLetterOne = wordOne.charAt(0);
        if (Character.isLowerCase(firstLetterOne)) {
            positionAlphabetic = firstLetterOne - tempPosNumLow;
            int resultLeftOne = firstNumber * positionAlphabetic; //LowerCase " * "
            totalResultOne = totalResultOne + resultLeftOne;
        } else {
            positionAlphabetic = firstLetterOne - tempPosNumUpp;
            double resultLeftOne = firstNumber *1.0 / positionAlphabetic ; //UpperCase " / "
            totalResultOne = totalResultOne + resultLeftOne;
        }

        char lastLetterOne = wordOne.charAt(wordOne.length() - 1);
        if (Character.isLowerCase(lastLetterOne)) {
            positionAlphabetic = lastLetterOne - tempPosNumLow;
            totalResultOne = totalResultOne + positionAlphabetic; //lower " + "
        } else {
            positionAlphabetic = lastLetterOne - tempPosNumUpp;
            totalResultOne = totalResultOne - positionAlphabetic; // upper " - "
        }

        // SECOND PART
        char secondLetterTwo = wordOne.charAt(0);
        int secondNumber = Integer.parseInt(wordOne.substring(1, wordOne.length() - 1));

        if (Character.isLowerCase(secondLetterTwo)) {
            positionAlphabetic = secondLetterTwo - tempPosNumLow;
            int resultRightOne = secondNumber * positionAlphabetic;
            totalResultTwo = totalResultTwo + resultRightOne;
        } else {
            positionAlphabetic = secondLetterTwo - tempPosNumUpp;
            double resultRightOne = secondNumber *1.0 / positionAlphabetic;
            totalResultTwo = totalResultTwo + resultRightOne;
        }

        char lastLetterTwo = wordOne.charAt(wordOne.length() - 1);
        if (Character.isLowerCase(lastLetterOne)) {

            positionAlphabetic = lastLetterTwo - tempPosNumLow;
            totalResultTwo = totalResultTwo + positionAlphabetic;
        } else {
            positionAlphabetic = lastLetterTwo - tempPosNumUpp;
            totalResultTwo = totalResultTwo - positionAlphabetic;
        }

        double total = totalResultOne + totalResultTwo;
        System.out.println(String.format("%.2f", total));
    }
}