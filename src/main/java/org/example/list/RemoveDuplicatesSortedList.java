package org.example.list;

public class RemoveDuplicatesSortedList {


    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        ListNode result = null;
        ListNode tmpValue = null;
        if (head != null) {
            result = new ListNode(head.val);
            tmpValue = result;
        }
        while (current != null) {
            if (tmpValue.val != current.val) {
                tmpValue.next = new ListNode(current.val);
                tmpValue = tmpValue.next;
            }
            current = current.next;
        }
        return result;
    }
}
