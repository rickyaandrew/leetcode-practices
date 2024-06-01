public class ValidParenthesisString {
    public boolean checkValidString(String s) {
        int min = 0;
        int max = 0;

        for (char currChar : s.toCharArray()) {
            switch (currChar) {
                case '(':
                    min++;
                    max++;
                    break;

                case ')':
                    min--;
                    max--;
                    break;

                case '*':
                    min--;
                    max++;
                    break;

                default:
                    break;
            }
            if (max < 0) {
                return false;
            }
            if (min < 0) {
                min = 0;
            }
        }
        return min == 0;
    }
}
