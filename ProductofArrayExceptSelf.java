public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int[] temp = new int[nums.length];
        temp[0] = 1;
        for (int j = nums.length - 1, i = 1; j >= 0; j--, i++) {
            temp[i] = temp[i - 1] * nums[j];
        }

        for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {
            result[i] = result[i] * temp[j];
        }
        return temp;
    }
}
