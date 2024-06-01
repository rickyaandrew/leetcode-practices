public class SquaresOfaSortedArray {
    public int[] sortedSquares(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int pointer = nums.length - 1;
        int[] result = new int[nums.length];

        int startValue;
        int endValue;

        while (end > start) {
            startValue = nums[start] * nums[start];
            endValue = nums[end] * nums[end];

            if (startValue > endValue) {
                result[pointer] = startValue;
                start++;
            } else {
                result[pointer] = endValue;
                end--;
            }
            pointer--;
        }
        result[pointer] = nums[start] * nums[start];
        return result;
    }
}
