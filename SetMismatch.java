import java.util.Arrays;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int missing = -1;
        int extra = -1;
        int counter = 1;
        int pointer = 0;

        while ((missing < 0 || extra < 0) && pointer < nums.length) {
            if (nums[pointer] > counter) {
                missing = counter;
                counter = nums[pointer]; 
            }
            if (nums[pointer] < counter) {
                extra = nums[pointer];
                counter = nums[pointer];
            }
            pointer++;
            counter++;
        }
        if (missing < 0) {
            missing = nums.length;
        }
        int[] result = new int[]{extra, missing};
        return result;
    }
}
