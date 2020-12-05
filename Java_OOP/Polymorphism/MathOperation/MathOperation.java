package MathOperation;

public class MathOperation {

// private MathOperation(){  ako ne iskam instanciq
// }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c){
     return add(a, b) + c;
    }

    public static int add(int a, int b, int c, int d){
     return add(a, b) + add(c, d);
    }
}
