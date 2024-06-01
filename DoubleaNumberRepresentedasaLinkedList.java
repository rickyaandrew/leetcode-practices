import java.util.Stack;

public class DoubleaNumberRepresentedasaLinkedList {
    public ListNode doubleIt(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        ListNode result = null;
        boolean isCarry = false;
        while (!stack.isEmpty()) {
            int curr = stack.pop();
            curr *= 2;
            if (isCarry) {
                curr++;
            }
            if (curr / 10 == 1) {
                isCarry = true;
            } else {
                isCarry = false;
            }
            ListNode newNode = new ListNode(curr % 10);
            newNode.next = result;
            result = newNode;
        }
        if (isCarry) {
            ListNode newNode = new ListNode(1);
            newNode.next = result;
            result = newNode;
        }
        return result;
    }
}
