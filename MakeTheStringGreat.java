import java.util.Stack;

public class MakeTheStringGreat {
    public String makeGood(String s) {
        char[] charArr = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();

        for (char val : charArr) {
            if (!stack.isEmpty() && Math.abs(stack.peek() - val) == 32) {
                stack.pop();
            } else {
                stack.push(val);
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }
        return result.toString();
    }
}
