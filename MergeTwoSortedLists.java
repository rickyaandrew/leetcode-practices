public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode pointer1 = list1;
        ListNode pointer2 = list2;
        ListNode result = new ListNode();
        ListNode resultPointer = result;

        while (pointer1 != null && pointer2 != null) {
            if (pointer1.val <= pointer2.val) {
                resultPointer.next = pointer1;
                resultPointer = resultPointer.next;
                pointer1 = pointer1.next;
            } else {
                resultPointer.next = pointer2;
                resultPointer = resultPointer.next;
                pointer2 = pointer2.next;
            }
        }

        if (pointer1 == null) {
            resultPointer.next = pointer2;
        } else {
            resultPointer.next = pointer1;
        }

        return result.next;
    }
}
