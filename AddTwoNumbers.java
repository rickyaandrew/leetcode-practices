public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode resultPointer = result;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int sum = 0;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry;
            carry = sum / 10;
            sum = sum % 10;

            ListNode newNode = new ListNode(sum);
            resultPointer.next = newNode;
            resultPointer = resultPointer.next;
        }

        if (carry != 0) {
            ListNode newNode = new ListNode(carry);
            resultPointer.next = newNode;
        }
        return result.next;
    }
}
