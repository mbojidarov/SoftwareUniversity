import java.util.Scanner;

public class SubstringRemove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String keyWord = scanner.nextLine();
        String text = scanner.nextLine();

        int indexKeyWord = text.indexOf(keyWord);

        while (text.contains(keyWord)){   //(indexKeyWord >= 0)
            text = text.substring(0, indexKeyWord)
                    + text.substring(indexKeyWord + keyWord.length());

            indexKeyWord = text.indexOf(keyWord);
        }
        System.out.println(text);
    }
}
