public class DeleteNodeinaLinkedList {
    public void deleteNode(ListNode node) {
        ListNode nextNode = node.next;
        node.val = nextNode.val;
        node.next = node.next.next;
    }
}
