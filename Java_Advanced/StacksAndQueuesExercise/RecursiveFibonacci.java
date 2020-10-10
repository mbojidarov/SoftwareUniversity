import java.util.Scanner;

public class RecursiveFibonacci {
    public static long [] memoryForFibonacci;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int n = Integer.parseInt(scanner.nextLine());

       memoryForFibonacci = new long[n + 1];

        System.out.println(fibonacci(n));
    }

    private static long fibonacci(int n) {
        if (n <= 1){    //дъно
            return 1;
        }
        if (memoryForFibonacci[n] != 0){         // има го вече изчислено
            return memoryForFibonacci[n];        // и запазено в масива

        }else {
            return memoryForFibonacci[n] = fibonacci(n - 1) + fibonacci(n - 2);
        }                                        // запазвам го и го връщам
    }

    private static int factorial(int n) {
        if (n == 0){     //дъно
            return 1;
        }else{
            return n * factorial(n -1);
        }
    }
}
