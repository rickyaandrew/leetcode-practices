import java.util.Stack;

public class MinimumRemovetoMakeValidParentheses {
    public String minRemoveToMakeValid(String s) {
        int leftCount = 0;
        int rightCount = 0;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (currChar == '(') {
                leftCount++;
            }
            if (currChar == ')') {
                rightCount++;
            }
            if (rightCount > leftCount) {
                rightCount--;
                continue;
            } else {
                stack.push(currChar);
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            char currChar = stack.pop();
            if (leftCount > rightCount && currChar == '(') {
                leftCount--;
            } else {
                result.append(currChar);
            }
        }
        return result.reverse().toString();
    }
}
