import java.util.Arrays;
import java.util.HashSet;

public class TheNumberofBeautifulSubsets {
    public int beautifulSubsets(int[] nums, int k) {
        Arrays.sort(nums);
        return recurse(nums, new HashSet<>(), k, 0);
    }

    private int recurse(int[] nums, HashSet<Integer> list, int k, int pointer) {
        if (pointer == nums.length) {
            return list.isEmpty() ? 0 : 1;
        }
        int count = 0;

        // dont take
        count += recurse(nums, list, k, pointer + 1);
        
        // take
        if (isBeautiful(list, nums[pointer] - k)) {
            list.add(nums[pointer]);
            count += recurse(nums, list, k, pointer + 1);
        }
        list.remove(nums[pointer]);


        return count;
    }

    private boolean isBeautiful(HashSet<Integer> list, int diff) {
        if (list.contains(diff)) {
            return false;
        }
        return true;
    }
}
