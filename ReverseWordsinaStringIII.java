public class ReverseWordsinaStringIII {
    public String reverseWords(String s) {
        int end = s.length();
        int start = 0;
        String result = "";
        while (start < end) {
            while (start < end && s.charAt(start) == ' ')
                start++;
            int pointer = start;
            while (start < end && s.charAt(start) != ' ')
                start++;
            if (result.isEmpty()) {
                for (int x = start - 1; x >= pointer; x--)
                    result += s.charAt(x);
            } else {
                result += " ";
                for (int x = start - 1; x >= pointer; x--)
                    result += s.charAt(x);
            }
        }
        return result;
    }
}
