package org.example.list;

import org.junit.jupiter.api.Test;

class MiddleLinkedListTest {

    @Test
    void middleNodeTest1() {
        MiddleLinkedList solution = new MiddleLinkedList();
        int[] array = new int[]{1, 2, 3, 4, 5};
        ListNode node = null;
        for (int i = array.length - 1; i >= 0; i--) {
            ListNode current = new ListNode(array[i]);
            current.next = node;
            node = current;
        }
        solution.middleNode(node);

    }

    @Test
    void middleNodeTest2() {
        MiddleLinkedList solution = new MiddleLinkedList();
        int[] array = new int[]{1, 2};
        ListNode node = null;
        for (int i = array.length - 1; i >= 0; i--) {
            ListNode current = new ListNode(array[i]);
            current.next = node;
            node = current;
        }
        solution.middleNode(node);

    }

}