import java.util.Arrays;

public class MinimumDifferenceBetweenLargestandSmallestValueinThreeMoves {
    public int minDifference(int[] nums) {
        int size = nums.length;
        if (size <= 4) {
            return 0;
        }
        Arrays.sort(nums);
        int[] diffFront = new int[4];
        Arrays.fill(diffFront, 0);
        int[] diffBack = new int[4];
        Arrays.fill(diffBack, 0);
        int highestDiff = 0;
        for (int i = 1; i < 4; i++) {
            diffFront[i] = nums[i] - nums[i - 1] + diffFront[i - 1];
            diffBack[i] = nums[size - i] - nums[size - 1 - i] + diffBack[i - 1];
        }
        for (int i = 0; i < diffFront.length; i++) {
            highestDiff = Math.max(highestDiff, diffFront[i] + diffBack[diffFront.length - 1 - i]);
        }
        return nums[size - 1] - nums[0] - highestDiff;
    }
}
