package org.example.list;

import org.junit.jupiter.api.Test;

class ReverseLinkedListTest {

    @Test
    void reverseList() {
        ReverseLinkedList solution = new ReverseLinkedList();
        ListNode node1 = createListFromArray(new int[]{1, 2, 3, 4, 5});
        solution.reverseList(node1);

    }

    @Test
    void reverseList1() {
        ReverseLinkedList solution = new ReverseLinkedList();
        ListNode node1 = createListFromArray(new int[]{1, 2});
        solution.reverseList(node1);

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