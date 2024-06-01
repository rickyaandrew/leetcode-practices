import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int matrixYLen = matrix.length;
        int matrixXLen = matrix[0].length;
        boolean[][] visited = new boolean[matrixYLen][matrixXLen];
        List<Integer> result = new ArrayList<Integer>();
        int y = 0;
        int x = 0;
        while (true) {
            if (!visited[y][x]) {
                result.add(matrix[y][x]);
                visited[y][x] = true;
            }

            while (x < matrixXLen - 1 && !visited[y][x + 1]) {
                x++;
                result.add(matrix[y][x]);
                visited[y][x] = true;
            }

            while (x < matrixXLen - 1 && !visited[y + 1][x]) {
                y++;
                result.add(matrix[y][x]);
                visited[y][x] = true;
            }

            while (x >= 0 && !visited[y][x - 1]) {
                x--;
                result.add(matrix[y][x]);
                visited[y][x] = true;
            }

            while (y >= 0 && !visited[y - 1][x]) {
                y--;
                result.add(matrix[y][x]);
                visited[y][x] = true;
            }

            if (result.size() == matrixYLen * matrixXLen) {
                break;
            }
        }

        return result;
    }
}

// 54
