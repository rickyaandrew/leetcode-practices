import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        recurse(0, s, new ArrayList<>(), ans);
        return ans;
    }

    private boolean isPalindrome(int left, int right, String str) {
        while (left <= right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private void recurse(int ind, String s, List<String> ds, List<List<String>> ans) {
        if (ind == s.length()) {
            ans.add(new ArrayList<String>(ds));
            return;
        }
        for (int i = ind; i < s.length(); i++) {
            if (isPalindrome(ind, i, s)) {
                ds.add(s.substring(ind, i + 1));
                recurse(i + 1, s, ds, ans);
                ds.remove(ds.size() - 1);
            }
        }

    }
}