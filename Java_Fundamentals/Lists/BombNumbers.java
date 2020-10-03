import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Integer> elements = Arrays.stream(input.split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String[] bombsInfo = scanner.nextLine().split("\\s+");
        int bomb = Integer.parseInt(bombsInfo[0]);
        int bombsPower = Integer.parseInt(bombsInfo[1]);
        int indexBomb = 0;
        int explsionRange = 0;

        while (elements.contains(bomb)) {

            indexBomb = elements.indexOf(bomb); //!!! nameList.indexOf(stoinost)

//            for (int i = 0; i < elements.size(); i++) { //ot left -> Right
//                if (elements.get(i).equals(bomb)) {
//                    indexBomb = i;
//                }
//            }
            int leftGranitsa = Math.max(indexBomb - bombsPower, 0); // -> moje da se pozva v IF-ovete
            int rightGranitsa = Math.min(indexBomb + bombsPower, elements.size()-1);
            for (int i = rightGranitsa; i >= leftGranitsa  ; i--) {
                elements.remove(i);
            }

//            if (indexBomb + bombsPower <= elements.size()) { //otzad napred
//                explsionRange = indexBomb + bombsPower;
//                for (int i = explsionRange; i > indexBomb; i--) {
//                    elements.remove(i);
//                }
//            } else {
//                explsionRange = ((elements.size() - 1) - indexBomb);
//                for (int i = elements.size() - 1; i > indexBomb; i--) {
//                    elements.remove(i);
//                }
//            }
//            if (indexBomb - bombsPower >= 0) {
//                explsionRange = indexBomb - bombsPower;
//                for (int i = indexBomb - 1; i >= explsionRange; i--) {
//                    elements.remove(i);
//                }
//            } else {
//                for (int i = indexBomb - 1; i >= 0; i--) {
//                    elements.remove(i);
//                }
//            }
//            elements.remove(Integer.valueOf(bomb));
        }
        int sum = 0;
        for (int i = 0; i < elements.size(); i++) {
            sum = sum + elements.get(i);
        }
        System.out.println(sum);
    }
}
