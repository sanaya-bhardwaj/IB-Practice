import java.util.*;

public class Solution {
    public ArrayList<ArrayList<String>> solveNQueens(int a) {
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        char[][] board = new char[a][a];

        for (int i = 0; i < a; i++)
            Arrays.fill(board[i], '.');

        boolean[] cols = new boolean[a];
        boolean[] diag1 = new boolean[2 * a]; // row - col + a
        boolean[] diag2 = new boolean[2 * a]; // row + col

        backtrack(0, a, board, cols, diag1, diag2, res);
        return res;
    }

    private void backtrack(int row, int n, char[][] board,
                           boolean[] cols, boolean[] diag1, boolean[] diag2,
                           ArrayList<ArrayList<String>> res) {

        if (row == n) {
            ArrayList<String> solution = new ArrayList<>();
            for (char[] r : board)
                solution.add(new String(r));
            res.add(solution);
            return;
        }

        for (int col = 0; col < n; col++) {
            int d1 = row - col + n;
            int d2 = row + col;

            if (cols[col] || diag1[d1] || diag2[d2])
                continue;

            board[row][col] = 'Q';
            cols[col] = diag1[d1] = diag2[d2] = true;

            backtrack(row + 1, n, board, cols, diag1, diag2, res);

            board[row][col] = '.';
            cols[col] = diag1[d1] = diag2[d2] = false;
        }
    }
}
