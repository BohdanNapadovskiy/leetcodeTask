package org.example.list;

import org.junit.jupiter.api.Test;

class MergeTwoSortedListsTest {

    @Test
    void mergeTwoLists() {
        MergeTwoSortedLists solution = new MergeTwoSortedLists();
        ListNode node1 = createListFromArray(new int[]{1, 2, 4});
        ListNode node2 = createListFromArray(new int[]{1, 3, 4});
        solution.mergeTwoLists(node1, node2);

    }


    @Test
    void mergeTwoLists1() {
        MergeTwoSortedLists solution = new MergeTwoSortedLists();
        ListNode node1 = null;
        ListNode node2 = null;
        solution.mergeTwoLists(node1, node2);

    }


    @Test
    void mergeTwoLists2() {
        MergeTwoSortedLists solution = new MergeTwoSortedLists();
        ListNode node1 = null;
        ListNode node2 = createListFromArray(new int[]{0});
        solution.mergeTwoLists(node1, node2);

    }



    private ListNode createListFromArray(int[] arr) {
        ListNode node = null;
        for (int i = arr.length - 1; i >= 0; i--) {
            ListNode current = new ListNode(arr[i]);
            current.next = node;
            node = current;
        }
        return node;

    }
}