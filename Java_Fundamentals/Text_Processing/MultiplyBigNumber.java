import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bigNumber = scanner.nextLine();
        int multiplier = Integer.parseInt(scanner.nextLine());
        if (multiplier == 0){
            System.out.println(0);
            return;
        }

        StringBuilder totalResult = new StringBuilder();
        int naUM = 0;

        for (int i = bigNumber.length()-1; i >= 0 ; i--) {
            int currentNum = Integer.parseInt(String.valueOf(bigNumber.charAt(i)));
                                            // sushtoto kato ("" + bigNumber.charAt(i))
            int tempResult = currentNum * multiplier + naUM;
            naUM = 0;
            if (tempResult > 9){
                int bigResult = tempResult % 10;
                naUM = tempResult / 10;

               totalResult.append(bigResult);
            }else{
                totalResult.append(tempResult);
            }
        }
        if(naUM != 0){
            totalResult.append(naUM);
        }
        System.out.println(totalResult.reverse());
    }
}
