import java.util.Collections;
import java.util.List;

public class CountPairsWhoseSumisLessthanTarget {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int result = 0;
        int left = 0;
        int right = nums.size() - 1;
        while (left < right) {
            if (nums.get(left) + nums.get(right) >= target) {
                result = result + (right - left);
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}