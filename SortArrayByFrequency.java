import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SortArrayByFrequency {
    public int[] frequencySort(int[] nums) {
        int[] result = new int[nums.length];
        ArrayList<Integer> sortedOrder = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int curr : nums) {
            if (map.containsKey(curr)) {
                map.put(curr, map.get(curr) + 1);
            } else {
                map.put(curr, 0);
            }
        }

        Set<Integer> keySet = map.keySet();
        Set<Integer> visited = new HashSet<>();

        System.out.println(keySet.size());

        while (visited.size() < keySet.size()) {
            int currSmallestKey = 999;
            for (Integer curr : keySet) {
                if (map.get(curr) < currSmallestKey && !visited.contains(curr)) {
                    currSmallestKey = curr;
                }
            }
            sortedOrder.add(currSmallestKey);
            visited.add(currSmallestKey);
            System.out.println(visited.size());
        }

        int pointer = 0;
        for (Integer curr : sortedOrder) {
            int freq = map.get(curr);
            for (int i = pointer; i < pointer + freq; i++) {
                result[i] = curr;
            }
            pointer = pointer + freq + 1;
        }

        return result;
    }
}
