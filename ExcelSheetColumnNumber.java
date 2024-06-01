public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int size = columnTitle.length() - 1;
        int res = 0;
        int charPointer = 0;
        
        while (size >= 0) {
            char currChar = columnTitle.charAt(charPointer);
            res += (currChar - 'A' + 1) * Math.pow(26, size);
            size--;
            charPointer++;
        }

        return res;

    }
}
