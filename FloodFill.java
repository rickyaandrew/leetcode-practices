public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int colour = image[sr][sc];
        if (colour != newColor) {
            dfs(image, sr, sc, colour, newColor);
        }
        return image;
    }
    private void dfs(int[][] image, int sr, int sc, int colour, int newColor) {
        if (image[sr][sc] == colour) {
            image[sr][sc] = newColor;
            if (sr + 1 <= image.length - 1) {
                dfs(image, sr + 1, sc, colour, newColor);
            }
            if (sr >= 1) {
                dfs(image, sr - 1, sc, colour, newColor);
            }
            if (sc + 1 <= image[0].length - 1) {
                dfs(image, sr, sc + 1, colour, newColor);
            }
            if (sc >= 1) {
                dfs(image, sr, sc - 1, colour, newColor);
            }
        }
    }
}
