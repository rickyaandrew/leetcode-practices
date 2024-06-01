
public class MiddleoftheLinkedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode middleNode(ListNode head) {
        ListNode speedOne = head;
        ListNode speedTwo = head;

        while (speedTwo != null && speedTwo.next != null) {
            speedOne = speedOne.next;
            speedTwo = speedTwo.next.next;
        }
        return speedOne;
    }
}
