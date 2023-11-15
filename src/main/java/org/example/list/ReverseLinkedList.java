package org.example.list;

public class ReverseLinkedList {


    ListNode result;

    public ListNode reverseList(ListNode head) {
        ListNode result = null;
        ListNode current = head;
        ListNode next = null;
        while (current != null) {
            ListNode tmpValue = new ListNode(current.val);
            tmpValue.next = next;
            result = tmpValue;
            next = tmpValue;
            current = current.next;

        }
        return result;
    }


}
