import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
/**
 * Online Solution
 */
class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> hm = new HashMap<>();

        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        // Sorting it in ascending order
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
                (a, b) -> b.getValue() - a.getValue());

        pq.addAll(hm.entrySet());

        StringBuilder result = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            result.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }

        return result.toString();
    }
}

public class Storage {
    private final char character;
    private int count = 1;

    Storage(char c) {
        this.character = c;
    }

    public char getCharacter() {
        return character;
    }

    public int getCount() {
        return count;
    }

    public boolean addCount() {
        this.count = this.count + 1;
        return true;
    }

}

public class StorageComparator implements Comparator<Storage> {
    public int compare(Storage s1, Storage s2) {
        if (s1.getCount() < s2.getCount())
            return 1;
        else if (s1.getCount() > s2.getCount())
            return -1;
        return 0;
    }

}

public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        PriorityQueue<Storage> queue = new PriorityQueue<>(new StorageComparator());
        int[] isCharPresent = new int[57];
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (isCharPresent[curr - 'A'] != 1) {
                Storage currStorage = new Storage(curr);
                queue.add(currStorage);
                isCharPresent[curr - 'A'] = 1;
            } else {
                queue.forEach(storage -> {
                    if (storage.getCharacter() == curr) {
                        storage.addCount();
                    }
                });
            }
        }
        while (!queue.isEmpty()) {
            Storage pointStorage = queue.poll();
            for (int i = 0; i < pointStorage.getCount(); i++) {
                res.append(pointStorage.getCharacter());
            }
        }

        return res.toString();
    }
}
