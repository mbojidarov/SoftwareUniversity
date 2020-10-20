import com.sun.source.tree.Tree;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputGuest = scanner.nextLine();

        TreeSet<String> vip = new TreeSet<>();
        TreeSet<String> regular = new TreeSet<>();

        while (!"PARTY".equals(inputGuest)) {
            if (Character.isDigit(inputGuest.charAt(0))) {
                vip.add(inputGuest);
            } else {
                regular.add(inputGuest);
            }
            inputGuest = scanner.nextLine();
        }
        inputGuest = scanner.nextLine();
        while (!"END".equals(inputGuest)){
            vip.remove(inputGuest);
            regular.remove(inputGuest);

//      NOT NECESSARY IF !!!
//            if (Character.isDigit(inputGuest.charAt(0))) {
//                vip.remove(inputGuest);
//            } else {
//                regular.remove(inputGuest);
//            }
            inputGuest = scanner.nextLine();
        }
        System.out.println(vip.size() + regular.size());
        if (!vip.isEmpty()){
            System.out.println(String.join(System.lineSeparator(), vip));
        }
        if (!regular.isEmpty()){
            System.out.println(String.join(System.lineSeparator(), regular));

//        for (String reg : regular) {
//            System.out.println(reg);
//        }
        }
    }
}
