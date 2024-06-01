public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int expectedValue = (nums.length * (nums.length + 1)) / 2;
        for (int i: nums) {
            sum +=i;
        }
        return expectedValue - sum;
    }
}
