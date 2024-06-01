public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null) {
            if (slow.equals(fast)) {
                return true;
            }
            slow = slow.next;
            if (fast.next == null) {
                break;
            }
            fast = fast.next.next;
        }
        return false;
    }
}
