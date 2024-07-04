public class MergeNodesinBetweenZeros {
    public ListNode mergeNodes(ListNode head) {
        ListNode result = new ListNode(0);
        ListNode currPointer = result;
        ListNode headPointer = head.next;
        int val = 0;
        while (headPointer != null) {
            int curr = headPointer.val;
            if (curr == 0) {
                ListNode newVal = new ListNode(val);
                currPointer.next = newVal;
                currPointer = currPointer.next;
                val = 0;
            } else {
                val += curr;
            }
            headPointer = headPointer.next;
        }
        return result.next;
    }
}
