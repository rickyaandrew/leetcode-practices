import java.util.LinkedList;
import java.util.List;

public class SubsetsSub {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        recurse(nums, 0, result, new LinkedList<>());
        return result;
    }

    private void recurse(int[] nums, int pointer, List<List<Integer>> result, List<Integer> currList) {
        if (pointer == nums.length) {
            result.add(currList);
            return;
        }
        List<Integer> reject = new LinkedList<>(currList);
        List<Integer> accept = new LinkedList<>(currList);
        accept.add(nums[pointer]);
        recurse(nums, pointer + 1, result, reject);
        recurse(nums, pointer + 1, result, accept);
    }

}
