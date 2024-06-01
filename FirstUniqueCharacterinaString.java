public class FirstUniqueCharacterinaString {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        int size = s.length();
        for (int i = 0; i < size; i++) {
            count[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < size; i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
