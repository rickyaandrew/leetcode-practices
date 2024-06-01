public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int ALPHABET_SIZE = 26;
        int[] countA = new int[26];
        int[] countB = new int[26];
        int sizeA = s.length();
        int sizeB = t.length();

        for (int i = 0; i < sizeA; i++) {
            countA[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < sizeB; i++) {
            countB[t.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ALPHABET_SIZE; i++) {
            if (countA[i] != countB[i]) {
                return false;
            }
        }
        return true;
    }
}
