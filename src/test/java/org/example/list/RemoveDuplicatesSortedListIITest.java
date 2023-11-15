package org.example.list;

import org.junit.jupiter.api.Test;

class RemoveDuplicatesSortedListIITest {

    @Test
    void deleteDuplicates() {
        RemoveDuplicatesSortedListII solution = new RemoveDuplicatesSortedListII();
        ListNode node1 = createListFromArray(new int[]{1, 2, 3, 3, 3, 4, 5});
        solution.deleteDuplicates(node1);

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