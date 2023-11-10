package org.example.list;

import org.junit.jupiter.api.Test;

class RemoveLinkedListElementTest {

    @Test
    void removeElements() {
        RemoveLinkedListElement solution = new RemoveLinkedListElement();
        int[] array = new int[]{1, 2, 6, 3, 4, 5, 6};
        ListNode node = null;
        for (int i = array.length - 1; i >= 0; i--) {
            ListNode current = new ListNode(array[i]);
            current.next = node;
            node = current;
        }
        solution.removeElements(node, 6);

    }


    @Test
    void removeElements1() {
        RemoveLinkedListElement solution = new RemoveLinkedListElement();
        ListNode node = new ListNode();
        solution.removeElements(node, 1);

    }


    @Test
    void removeElements2() {
        RemoveLinkedListElement solution = new RemoveLinkedListElement();
        int[] array = new int[]{7, 7, 7, 7};
        ListNode node = null;
        for (int i = array.length - 1; i >= 0; i--) {
            ListNode current = new ListNode(array[i]);
            current.next = node;
            node = current;
        }
        solution.removeElements(node, 7);

    }


}