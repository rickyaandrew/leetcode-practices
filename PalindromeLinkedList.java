import java.util.Stack;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        Stack<Integer> stack = new Stack<Integer>();

        if (slow == null) {
            return true;
        }

        while (fast != null) {
            stack.push(slow.val);
            fast = fast.next;
            if (fast == null) {
                break;
            }
            slow = slow.next;
            fast = fast.next;
        }
        int curr;
        slow = slow.next;
        while (slow != null) {
            curr = slow.val;
            if (curr != stack.pop()) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }
}
