import java.util.Arrays;

public class LargestPositiveIntegerThatExistsWithItsNegative {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int pointer1 = 0;
        int pointer2 = nums.length - 1;
        while (pointer1 < pointer2) {
            if (nums[pointer1] + nums[pointer2] == 0) {
                return nums[pointer2];
            }

            if (nums[pointer1] + nums[pointer2] > 0) {
                pointer2--;
            } else {
                pointer1++;
            }
        }
        return -1;
    }
}
