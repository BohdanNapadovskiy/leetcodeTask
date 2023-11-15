package org.example.list;

public class RemoveDuplicatesSortedListII {
    ListNode result;

    public ListNode deleteDuplicates(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        if (current.next == null)
            return current;
        while (current != null) {


            current = current.next;

        }


        return result;
    }

}
