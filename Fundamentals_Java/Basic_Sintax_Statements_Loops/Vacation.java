import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int persons = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String day = scanner.nextLine();

        double totalPrice = 0;

        switch (typeGroup){
            case "Students":
                if ("Friday".equals(day)) {
                    if (persons >= 30) {
                        totalPrice = (persons * 8.45) * 0.85;
                    }else {
                        totalPrice = persons * 8.45;
                    }
                } else if ("Saturday".equals(day)) {
                    if (persons >= 30) {
                        totalPrice = (persons * 9.80) * 0.85;
                    }else {
                        totalPrice = persons * 9.80;
                    }
                }else if ("Sunday".equals(day)){
                    if (persons >= 30) {
                        totalPrice = (persons * 10.46) * 0.85;
                    }else {
                        totalPrice = persons * 10.46;
                    }
                }
                break;

            case "Business":
                if ("Friday".equals(day)) {
                    if (persons >= 100) {
                        totalPrice = (persons - 10) * 10.90;
                    }else{
                        totalPrice = persons * 10.90;
                    }
                } else if ("Saturday".equals(day)) {
                    if (persons >= 100) {
                        totalPrice = (persons - 10) * 15.60;
                    }else{
                        totalPrice = persons * 15.60;
                    }
                }else if ("Sunday".equals(day)){
                    if (persons >= 100) {
                        totalPrice = (persons - 10) * 16;
                    }else{
                        totalPrice = persons * 16;
                    }
                }
                break;

            case "Regular":
                if ("Friday".equals(day)) {
                    if (persons >= 10 && persons <= 20) {
                        totalPrice = (persons * 15) * 0.95;
                    } else {
                        totalPrice = persons * 15;
                    }

                } else if ("Saturday".equals(day)) {
                    if (persons >= 10 && persons <= 20) {
                        totalPrice = (persons * 20) * 0.95;
                    } else {
                        totalPrice = persons * 20;
                    }

                }else if ("Sunday".equals(day)){
                    if (persons >= 10 && persons <= 20) {
                        totalPrice = (persons * 22.5) * 0.95;
                    } else {
                        totalPrice = persons * 22.5;
                    }
                }
                break;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
