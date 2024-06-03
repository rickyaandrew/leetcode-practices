public class AppendCharacterstoStringtoMakeSubsequence {
    public int appendCharacters(String s, String t) {
        int sLength = s.length();
        int tPointer = 0;

        for (int i = 0; i < sLength; i++) {
            if (tPointer >= t.length()) {
                return 0;
            }
            if (t.charAt(tPointer) == s.charAt(i)) {
                tPointer++;
            }
        }
        return t.length() - tPointer;
    }

    public int appendCharactersSolution2(String s, String t) {
        int sIndex = 0, tIndex = 0;
        int sLength = s.length(), tLength = t.length();

        while (sIndex < sLength && tIndex < tLength) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                tIndex++;
            }
            sIndex++;
        }
        return tLength - tIndex;
    }

}
