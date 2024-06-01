import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        recurse(0, nums, list, result);
        return result;
    }

    private void recurse(int counter, int[] nums, List<Integer> list, List<List<Integer>> result) {
        if (counter >= nums.length) {
            result.add(new ArrayList<>(list));
        } else {
            // pick
            list.add(nums[counter]);
            recurse(counter + 1, nums, list, result);
            // didnt pick
            list.remove(list.size() - 1);
            recurse(counter + 1, nums, list, result);
        }
    }

}
