package JediGalaxy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] galaxySize = scanner.nextLine().split("\\s+");
        int row = Integer.parseInt(galaxySize[0]);
        int col = Integer.parseInt(galaxySize[1]);

        Galaxy starGalaxy = new Galaxy(row, col);

        String startCoordinates = scanner.nextLine();
        while (!"Let the Force be with you".equals(startCoordinates)){
            int jediRow = Integer.parseInt(startCoordinates.split("\\s+")[0]);
            int jediCol = Integer.parseInt(startCoordinates.split("\\s+")[1]);
            startCoordinates = scanner.nextLine();

            String[] evilStart = startCoordinates.split("\\s+");
            int evilRow = Integer.parseInt(evilStart[0]);
            int evilCol = Integer.parseInt(evilStart[1]);

            starGalaxy.evilMove(evilRow, evilCol);
            starGalaxy.jediMove(jediRow, jediCol);

            startCoordinates = scanner.nextLine();
        }

        System.out.println(starGalaxy.getJedi());
    }
}
