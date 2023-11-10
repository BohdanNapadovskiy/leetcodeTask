package org.example.list;

import org.junit.jupiter.api.Test;

class RemoveDuplicatesSortedListTest {

    @Test
    void deleteDuplicates() {
        RemoveDuplicatesSortedList solution = new RemoveDuplicatesSortedList();
        int[] array = new int[]{1, 1, 2};
//        int[] array = new int[]{1,1,2,3,3};
        ListNode node = null;
        for (int i = array.length - 1; i >= 0; i--) {
            ListNode current = new ListNode(array[i]);
            current.next = node;
            node = current;
        }
        solution.deleteDuplicates(node);
    }
}