import java.util.HashSet;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int result = 0;
        HashSet<Character> set = new HashSet<>();
        for (char curr : s.toCharArray()) {
            if (set.contains(curr)) {
                result += 2;
                set.remove(curr);
            } else {
                set.add(curr);
            }
        }
        if (!set.isEmpty()) {
            result++;
        }
        return result;
    }
}
