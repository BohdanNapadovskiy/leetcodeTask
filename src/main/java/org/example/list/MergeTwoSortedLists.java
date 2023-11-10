package org.example.list;

public class MergeTwoSortedLists {


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result;
        if (list1 != null && list2 != null) {
            result = getResultFromTwoLists(list1, list2);
        } else {
            result = getResultForExceptions(list1, list2);
        }
        return result;


    }

    private ListNode getResultFromTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode val1 = list1;
        ListNode val2 = list2;
        ListNode tmp = result;
        while (val1 != null && val2 != null) {
            if (val1.val <= val2.val) {
                tmp = new ListNode(val1.val);
                val1 = val1.next;
            } else {
                tmp = new ListNode(val2.val);
                val2 = val2.next;
            }
            tmp = tmp.next;

        }
        return result;
    }

    private ListNode getResultForExceptions(ListNode list1, ListNode list2) {
        if (list1 != null && list2 == null) return list1;
        else if (list1 == null && list2 != null) return list2;
        else return null;
    }

}
