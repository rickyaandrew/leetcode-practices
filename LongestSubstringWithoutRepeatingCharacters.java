import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0, res = 0;
        while (j < s.length()) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(i, map.get(s.charAt(j)) + 1);
            }
            map.put(s.charAt(j), j);
            res = Math.max(res, j - i + 1);
            j++;
        }
        return res;
    }
}


