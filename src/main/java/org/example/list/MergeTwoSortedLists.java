package org.example.list;

public class MergeTwoSortedLists {
    ListNode result;

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode val1 = list1;
        ListNode val2 = list2;
        while (val1 != null) {
            addValue(val1.val);
            val1 = val1.next;
        }
        while (val2 != null) {
            addValue(val2.val);
            val2 = val2.next;
        }
        return result;

    }

    private void addValue(int val) {
        ListNode newLink = new ListNode(val);
        ListNode previous = null;
        ListNode current = result;
        while (current != null && val > current.val) {
            previous = current;
            current = current.next;
        }
        if (previous == null) {
            result = newLink;
        } else {
            previous.next = newLink;
        }
        newLink.next = current;

    }


}
