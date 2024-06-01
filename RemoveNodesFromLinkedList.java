import java.util.Stack;

public class RemoveNodesFromLinkedList {
    public ListNode removeNodes(ListNode head) {
        ListNode curr = head;
        Stack<ListNode> stack = new Stack<>();

        while (curr != null) {
            while (!stack.isEmpty() && curr.val > stack.peek().val) {
                stack.pop();
            }
            stack.push(curr);
            curr = curr.next;
        }
        ListNode res = null;
        while (!stack.isEmpty()) {
            ListNode currNode = stack.pop();
            currNode.next = res;
            res = currNode;
        }
        return res;
    }
}
