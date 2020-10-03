import java.util.Scanner;

public class SecretChat10042020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder inputSB = new StringBuilder(input);
        //inputSB.append(input);

        while (!"Reveal".equals(input)) {
            String[] parts = input.split(":\\|:");
            String command = parts[0];

            switch (command) {
                case "InsertSpace":
                    int index = Integer.parseInt(parts[1]);
                    inputSB.insert(index, " ");
                    System.out.println(inputSB);
                    break;
                case "Reverse":
                    String reverseSub = parts[1];

                    if (inputSB.toString().contains(reverseSub)){
                        int startInd = inputSB.indexOf(reverseSub);
                        inputSB.delete(startInd, startInd + reverseSub.length());

                        String reverse = new StringBuilder(reverseSub).reverse().toString();
                        inputSB.append(reverse);
                        System.out.println(inputSB);
                    }else{
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String replaceSub = parts[1];
                    String newReplacement = parts[2];

                    String current = inputSB.toString().replace(replaceSub, newReplacement);
//                    String current = inputSB.toString();
//                    while (current.contains(replaceSub)){
//                       current = current.replace(replaceSub, newReplacement);
//                    }
                    inputSB = new StringBuilder(current);
                    System.out.println(inputSB);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", inputSB);
    }
}
