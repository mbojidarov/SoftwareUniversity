package RandomArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RandomArrayList<Integer> elements = new RandomArrayList();

//        elements.stream().forEach(elements::add);

        for (int i = 0; i < 500; i++) {
            elements.add(i);
        }
        System.out.println(elements.getRandomElement());
    }
}
