import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= first; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                continue;
            }

            for (int j = 2; j <= second; j++) {
                boolean prime = false;
                for (int m = 2; m <= j / 2; m++) {
                    if (j % m == 0) {
                        continue;
                    } else{
                        prime = true;
                    }
                    if (!prime){
                        System.out.print(j + " ");
                    }else{
                        break;
                    }

                    for (int k = 1; k <= third; k++) {
                        if (k % 2 == 0) {
                            System.out.println(k + " ");
                        }else{
                            continue;
                        }

                    }

                }


            }
        }
    }
}
