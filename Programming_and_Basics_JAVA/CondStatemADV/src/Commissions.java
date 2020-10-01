import java.util.Scanner;

public class Commissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        double commission = 0;

        switch (city) {
            case "Sofia":
                if (sales >= 0 && sales <= 500) {
                    commission = sales * 5 / 100;
                    System.out.printf("%.2f", commission);
                } else if (sales > 500 && sales <= 1000) {
                    commission = sales * 7 / 100;
                    System.out.printf("%.2f", commission);
                } else if (sales > 1000 && sales <= 10000) {
                    commission = sales * 8 / 100;
                    System.out.printf("%.2f", commission);
                } else if (sales > 10000) {
                    commission = sales * 12/100;
                    System.out.printf("%.2f", commission);
                }else {
                    System.out.println("error");
                }
                break;
            case "Varna":
                if (sales >= 0 && sales <= 500) {
                    commission = sales * 4.5 / 100;
                    System.out.printf("%.2f", commission);
                } else if (sales > 500 && sales <= 1000) {
                    commission = sales * 7.5 / 100;
                    System.out.printf("%.2f", commission);
                } else if (sales > 1000 && sales <= 10000) {
                    commission = sales * 10 / 100;
                    System.out.printf("%.2f", commission);
                } else if (sales > 10000) {
                    commission = sales * 13/100;
                    System.out.printf("%.2f", commission);
                }else{
                    System.out.println("error");
                }
                break;
            case "Plovdiv":
                if (sales >= 0 && sales <= 500) {
                    commission = sales * 5.5 / 100;
                    System.out.printf("%.2f", commission);
                } else if (sales > 500 && sales <= 1000) {
                    commission = sales * 8 / 100;
                    System.out.printf("%.2f", commission);
                } else if (sales > 1000 && sales <= 10000) {
                    commission = sales * 12/ 100;
                    System.out.printf("%.2f", commission);
                } else if (sales > 10000) {
                    commission = sales * 14.5/100;
                    System.out.printf("%.2f", commission);
                }else{
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
        }
    }
}

