public class FindtheMinimumandMaximumNumberofNodesBetweenCriticalPoints {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode pointerNode = head.next;
        int first = -1;
        int prevVal = head.val;
        int index = 1;
        int prevIndex = -1;
        int smallestDiff = Integer.MAX_VALUE;
        if (head.next == null) {
            return new int[] { -1, -1 };
        }

        while (pointerNode.next != null) {
            int currVal = pointerNode.val;
            if ((currVal < prevVal && currVal < pointerNode.next.val)
                    || (currVal > prevVal && currVal > pointerNode.next.val)) {
                if (first < 0) {
                    first = index;
                }
                if (prevIndex > 0) {
                    smallestDiff = Math.min(smallestDiff, index - prevIndex);
                }
                prevIndex = index;
            }
            prevVal = currVal;
            pointerNode = pointerNode.next;
            index++;
        }
        if (smallestDiff > index) {
            return new int[] { -1, -1 };
        }

        return new int[] { smallestDiff, prevIndex - first };
    }
}
