import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] sortedArr = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sortedArr);
        int result = 0;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sortedArr[i]) {
                result++;
            }
        }
        return result;
    }
}
