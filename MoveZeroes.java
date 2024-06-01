public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int p = 0;
        int temp;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp = nums[i];
                nums[i] = nums[p];
                nums[p] = temp;
                p++;
            }
        }
    }
}
