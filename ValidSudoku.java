import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> set = new HashSet<Character>();
        Set<Character> setVertical = new HashSet<Character>();

        Set<Character> sq1 = new HashSet<Character>();
        Set<Character> sq2 = new HashSet<Character>();
        Set<Character> sq3 = new HashSet<Character>();
        // check rows and column valid
        for (int i = 0; i < board.length; i++) {
            set.clear();
            setVertical.clear();
            if (i % 3 == 0) {
                sq1.clear();
                sq2.clear();
                sq3.clear();
            }
            for (int j = 0; j < board.length; j++) {
                if (j / 3 == 0) {
                    if (sq1.contains(board[i][j])) {
                        return false;
                    }
                    if (board[i][j] != '.' && !sq1.contains(board[i][j])) {
                        sq1.add(board[i][j]);
                    }
                }
                if (j / 3 == 1) {
                    if (sq2.contains(board[i][j])) {
                        return false;
                    }
                    if (board[i][j] != '.' && !sq2.contains(board[i][j])) {
                        sq2.add(board[i][j]);
                    }
                }
                if (j / 3 == 2) {
                    if (sq3.contains(board[i][j])) {
                        return false;
                    }
                    if (board[i][j] != '.' && !sq3.contains(board[i][j])) {
                        sq3.add(board[i][j]);
                    }
                }

                if (set.contains(board[i][j]) || setVertical.contains(board[j][i])) {
                    return false;
                }
                if (board[i][j] != '.' && !set.contains(board[i][j])) {
                    set.add(board[i][j]);
                }
                if (board[j][i] != '.' && !setVertical.contains(board[j][i])) {
                    setVertical.add(board[j][i]);
                }
            }
        }

        return true;

    }

    public boolean isBetterValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> rows = new HashSet<Character>();
            HashSet<Character> columns = new HashSet<Character>();
            HashSet<Character> cube = new HashSet<Character>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && !rows.add(board[i][j]))
                    return false;
                if (board[j][i] != '.' && !columns.add(board[j][i]))
                    return false;
                int RowIndex = 3 * (i / 3);
                int ColIndex = 3 * (i % 3);
                if (board[RowIndex + j / 3][ColIndex + j % 3] != '.'
                        && !cube.add(board[RowIndex + j / 3][ColIndex + j % 3]))
                    return false;
            }
        }
        return true;
    }

}
