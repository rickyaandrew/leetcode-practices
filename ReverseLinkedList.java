public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode result = null;
        ListNode currPointer = head;
        ListNode nextPointer = head.next;

        while (nextPointer != null) {
            currPointer.next = result;
            result = currPointer;
            currPointer = nextPointer;
            nextPointer = nextPointer.next;
        }
        currPointer.next = result;
        return currPointer;
    }
}
