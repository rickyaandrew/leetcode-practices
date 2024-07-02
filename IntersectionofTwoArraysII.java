import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionofTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        ArrayList<Integer> arrResult = new ArrayList<>();
        for (int currNum : nums1) {
            if (map1.containsKey(currNum)) {
                map1.put(currNum, map1.get(currNum) + 1);
            } else {
                map1.put(currNum, 1);
            }
        }
        for (int currNum : nums2) {
            if (map2.containsKey(currNum)) {
                map2.put(currNum, map2.get(currNum) + 1);
            } else {
                map2.put(currNum, 1);
            }
        }
        for (Integer currKey : map1.keySet()) {
            if (map2.containsKey(currKey)) {
                int reps = Math.min(map1.get(currKey), map2.get(currKey));
                for (int i = 0; i < reps; i++) {
                    arrResult.add(currKey);
                }
            }
        }
        return arrResult.stream().mapToInt((i) -> i).toArray();
    }
}
