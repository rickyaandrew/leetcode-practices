public class MaximumNestingDepthoftheParentheses {
    public int maxDepth(String s) {
        int counter = 0;
        int res = 0;
        for (char curr : s.toCharArray()) {
            switch (curr) {
                case '(':
                    counter++;
                    if (counter > res) {
                        res = counter;
                    }
                    break;
                case ')':
                    counter--;
                    break;
                default:
                    break;
            }
        }
        return res;
    }
}
