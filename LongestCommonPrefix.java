public class LongestCommonPrefix {
    private static int WORD_SIZE = 200;

    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder("");

        for (int i = 0; i < WORD_SIZE; i++) {
            if (strs[0].length() < i) {
                return res.toString(); 
            }
            char currChar = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].length() < i) {
                    return res.toString(); 
                }
                if (strs[j].charAt(i) != (currChar)) {
                    return res.toString();
                }
            }
            res.append(currChar);
        }
        return res.toString();
    }
}
