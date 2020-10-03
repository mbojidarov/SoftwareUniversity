import java.util.Scanner;

public class PassGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //OMG ZADACHA!!!
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i < n ; i++) {       //Symbol-1
            for (int j = 1; j < n; j++) {        // Symbol-2
                for (char k = 'a'; k < 'a' + l; k++) {   //Symbol-3
                    for (char m = 'a'; m < 'a' + l; m++) {   //Symbol-4
                        for (int o = 1; o <= n; o++) {       //Symbol-5
                            if (o > i && o > j){
                                System.out.printf("%d%d%c%c%d ", i, j, k, m, o);
                            }
                        }
                    }
                }
            }
        }
    }
}
