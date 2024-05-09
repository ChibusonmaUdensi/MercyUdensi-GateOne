public class Sudoku {
	public static void main(String[] args){
     public int[][] grid9x9 = new int[9][9];
}

public class Square3x3 {

    public boolean allThere(int[][] grid, int row, int column) {
        int[] options = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        for (int i = row; i < row + 3; i++) {
            for (int j = column; j < column + 3; j++) {
                options = testOptions(options, grid[i][j]);
            }
        }

        for (int num : options) {
            if (num != -1)
                return false;
        }

        return true;
    }

    private int[] testOptions(int[] options, int gridValue) {
        for (int i = 0; i < options.length; i++) {
            if (gridValue == options[i]) {
                options[i] = -1;
                break;
            }
        }
        return options;
    }
    }
}