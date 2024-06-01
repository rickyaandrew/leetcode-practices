import java.util.HashMap;
import java.util.Set;

public class DivideArrayIntoEqualPairs {
    public boolean divideArray(int[] nums) {
        if (nums.length % 2 != 0) {
            return false;
        }
        HashMap<Integer, Integer> mappings = new HashMap<Integer, Integer>();
        for (int num: nums) {
            if (mappings.containsKey(num)) {
                mappings.put(num, mappings.get(num) + 1);
            } else {
                mappings.put(num, 1);
            }
        }

        Set<Integer> keys = mappings.keySet();
        for (int key: keys) {
            if (mappings.get(key) % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
