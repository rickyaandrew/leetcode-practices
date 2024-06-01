import java.util.Arrays;

public class FindWordsThatCanBeFormedbyCharacters {
    public int countCharacters(String[] words, String chars) {
        int result = 0;
        int[] library = new int[26];
        for (int i = 0; i < chars.length(); i++) {
            library[chars.charAt(i) - 'a']++;
        }
        for (String word : words) {
            if (canForm(word, library)) {
                result += word.length();
            }
        }
        return result;
    }

    private boolean canForm(String word, int[] library) {
        int[] libCopy = Arrays.copyOf(library, library.length);
        for (int i = 0; i < word.length(); i++) {
            libCopy[word.charAt(i) - 'a']--;
            if (libCopy[word.charAt(i) - 97] < 0) {
                return false;
            }
        }
        return true;
    }
}