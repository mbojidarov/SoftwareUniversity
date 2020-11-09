package JediGalaxy;

public class Galaxy {
    private int row;
    private int col;
    private int[][] starsGalaxy;
    private JediKnight jedi;

    public Galaxy(int row, int col) {
        this.row = row;
        this.col = col;
        this.starsGalaxy = new int[row][col];
        this.jedi = new JediKnight();
        putGalaxyStars();
    }

    private void putGalaxyStars() {
        int starCount = 0;
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                this.starsGalaxy[r][c] = starCount++;
            }
        }
    }

    public void evilMove(int row, int col) {

        while (row >= 0 && col >= 0) {
            if (isInBounds(starsGalaxy, row, col)) {
                this.starsGalaxy[row][col] = 0;
            }
            row--;
            col--;
        }
    }

    public void jediMove(int row, int col) {
        while (row >= 0 && col < starsGalaxy.length) {
            if (isInBounds(starsGalaxy, row, col)) {
                jedi.setTotalScore(this.starsGalaxy[row][col] + jedi.getTotalScore());
            }
            row--;
            col++;
        }
    }

    public JediKnight getJedi() {
        return jedi;
    }

    private static boolean isInBounds(int[][] matrix, int row, int col) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[0].length;
    }

}
