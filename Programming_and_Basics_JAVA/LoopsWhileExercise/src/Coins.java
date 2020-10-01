import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());
        double stotinki = Math.floor(input * 100);
        int coinsCount = 0;

        while (stotinki > 0) {
            if (stotinki >= 200) {
                stotinki = stotinki - 200;
                coinsCount++;
            }else if (stotinki >= 100) {
                stotinki = stotinki - 100;
                coinsCount++;
            }else if (stotinki >= 50) {
                stotinki = stotinki - 50;
                coinsCount++;
            } else if (stotinki >= 20) {
                stotinki = stotinki - 20;
                coinsCount++;
            }else if (stotinki >= 10) {
                stotinki = stotinki - 10;
                coinsCount++;
            } else if (stotinki >= 5) {
                stotinki = stotinki - 5;
                coinsCount++;
            } else if (stotinki >= 2) {
                stotinki = stotinki - 2;
                coinsCount++;
            } else if (stotinki >= 1) {
                stotinki = stotinki - 1;
                coinsCount++;
            }
        }
        System.out.println(coinsCount);
    }
}