public class SumofAllSubsetXORTotals {
    public int subsetXORSum(int[] nums) {
        return recurse(nums, 0, 0);
    }

    private int recurse(int[] nums, int pointer, int currVal) {
        if (pointer == nums.length) {
            return currVal;
        }
        int takeXOR = recurse(nums, pointer + 1, currVal ^ nums[pointer]);
        int noTakeXOR = recurse(nums, pointer + 1, currVal);
        return takeXOR + noTakeXOR;
    }
}
