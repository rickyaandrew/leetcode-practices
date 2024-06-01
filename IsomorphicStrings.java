import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        HashSet<Character> taken = new HashSet<Character>();
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (!map.containsKey(curr)) {
                if (!taken.contains(t.charAt(i))) {
                    map.put(curr, t.charAt(i));
                    taken.add(t.charAt(i));
                } else {
                    return false;
                }
            } else {
                if (!map.get(curr).equals(t.charAt(i))) {
                    return false;
                }
            }
        }

        return true;
    }
}
