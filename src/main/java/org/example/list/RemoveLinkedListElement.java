package org.example.list;

public class RemoveLinkedListElement {

    public ListNode removeElements(ListNode head, int val) {
        ListNode current = head;
        ListNode result = null;
        ListNode tmp = null;
        if (head == null)
            return result;
        while (current != null) {
            if (current.val != val) {
                if (result == null) {
                    result = new ListNode(current.val);
                    tmp = result;
                } else {
                    tmp.next = new ListNode(current.val);
                    tmp = tmp.next;
                }
            }
            current = current.next;
        }
        return result;
    }

}
