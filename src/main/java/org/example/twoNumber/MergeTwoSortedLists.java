package org.example.twoNumber;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        boolean keepGoing = true;
        ListNode result = new ListNode() ;
        ListNode head = getMinNode(list1, list2);
        while(keepGoing) {
            if(head.next == null) {
                keepGoing =false;
            } else {
                ListNode currentValue = head.next;
                currentValue = getMinNode(list1.next, list2.next);
            }
            int a=1;
        }

//        ListNode result = new ListNode(getMinNode(list1, list2).val);
//        result.next



        return result;


    }


    private ListNode getMinNode(ListNode list1, ListNode list2) {
        if (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                return list1;
            } else {
                return list2;
            }
        } else if (list1 != null) {
            return list1;
        } else {
            return list2;
        }

    }
}
