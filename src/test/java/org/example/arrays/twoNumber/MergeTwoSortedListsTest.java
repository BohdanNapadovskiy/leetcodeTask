package org.example.arrays.twoNumber;

import org.junit.jupiter.api.Test;

class MergeTwoSortedListsTest {

    @Test
    void mergeTwoLists() {
        ListNode l1 = new ListNode(1,new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1,new ListNode(3, new ListNode(4)));
        MergeTwoSortedLists solution = new MergeTwoSortedLists();
        solution.mergeTwoLists(l1, l2);

    }
}