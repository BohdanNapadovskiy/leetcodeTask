package org.example.list;

import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {

    @Test
    void addTwoNumbers() {
        AddTwoNumbers solution = new AddTwoNumbers();
        ListNode node1 = createListFromArray(new int[]{2, 4, 3});
        ListNode node2 = createListFromArray(new int[]{5, 6, 4});
        solution.addTwoNumbers(node1, node2);
    }

    @Test
    void addTwoNumbers1() {
        AddTwoNumbers solution = new AddTwoNumbers();
        ListNode node1 = createListFromArray(new int[]{0});
        ListNode node2 = createListFromArray(new int[]{0});
        solution.addTwoNumbers(node1, node2);
    }

    @Test
    void addTwoNumbers3() {
        AddTwoNumbers solution = new AddTwoNumbers();
        ListNode node1 = createListFromArray(new int[]{9, 9, 9, 9, 9, 9, 9});
        ListNode node2 = createListFromArray(new int[]{9, 9, 9, 9});
        solution.addTwoNumbers(node1, node2);
    }


    @Test
    void addTwoNumbers2() {
        AddTwoNumbers solution = new AddTwoNumbers();
        ListNode node1 = createListFromArray(new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1});
        ListNode node2 = createListFromArray(new int[]{5, 6, 4});
        solution.addTwoNumbers(node1, node2);
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