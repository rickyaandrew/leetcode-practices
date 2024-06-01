public class MinimumAdditionstoMakeValidString {
    public int addMinimum(String word) {
        int index = 0, count = 0;
        char nextChar = 'a';
        while (index < word.length()) {
            if (word.charAt(index) != nextChar)
                count++;
            else
                index++;
            nextChar = (char) ('a' + ((nextChar + 1) - 'a') % 3);
        }
        if (nextChar == 'b')
            count += 2;
        else if (nextChar == 'c')
            count += 1;
        return count;
    }

}
