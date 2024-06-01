public class WordSearch {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    result = backtrack(board, word, visited, i, j, 0);
                    if (result) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean backtrack(char[][] board, String word, boolean[][] visited, int i, int j, int pointer) {
        if (pointer == word.length()) {
            return true;
        }
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length
                || visited[i][j] == true || word.charAt(pointer) != board[i][j]) {
            return false;
        }
        visited[i][j] = true;
        if (backtrack(board, word, visited, i - 1, j, pointer + 1) ||
                backtrack(board, word, visited, i + 1, j, pointer + 1) ||
                backtrack(board, word, visited, i, j - 1, pointer + 1) ||
                backtrack(board, word, visited, i, j + 1, pointer + 1)) {
            return true;
        }
        visited[i][j] = false;
        return false;
    }
}
