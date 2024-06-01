public class PermutationinString {
    public boolean checkInclusion(String s1, String s2) {
        int[] counts = new int[26];
        for (char ch : s1.toCharArray()) {
            counts[ch - 'a']++;
        }
        int total = s1.length();
        int start = 0, end = 0;
        while (end < s2.length()) {
            if (counts[s2.charAt(end++) - 'a']-- > 0)
                total--;
            if (total == 0)
                return true;
            if (end - start == s1.length() && counts[s2.charAt(start++) - 'a']++ >= 0)
                total++;
        }
        return false;
    }
}
