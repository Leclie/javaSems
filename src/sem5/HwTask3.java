package sem5;

public class HwTask3 {
//    На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску.

    private static final int SIZE = 8;
    private static int[] queens = new int[SIZE];
    private static int solutions = 0;

    public static void main(String[] args) {
        solve(0);
        System.out.println("Total solutions: " + solutions);
    }

    private static void solve(int row) {
        if (row == SIZE) {
            printBoard();
            solutions++;
        } else {
            for (int i = 0; i < SIZE; i++) {
                queens[row] = i;
                if (isSafe(row)) {
                    solve(row + 1);
                }
            }
        }
    }

    private static boolean isSafe(int row) {
        for (int i = 0; i < row; i++) {
            int diff = Math.abs(queens[row] - queens[i]);
            if (diff == 0 || diff == row - i) {
                return false;
            }
        }
        return true;
    }

    private static void printBoard() {
        System.out.println("Solution " + solutions + ":");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (queens[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
