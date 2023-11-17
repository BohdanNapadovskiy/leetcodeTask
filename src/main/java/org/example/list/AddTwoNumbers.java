package org.example.list;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode val1 = l1;
        ListNode val2 = l2;
        ListNode result = null;
        ListNode current = null;
        int counter = 0;
        while (val1 != null || val2 != null || counter > 0) {
            int number1 = val1 != null ? val1.val : 0;
            int number2 = val2 != null ? val2.val : 0;
            int sum = (number1 + number2) + counter;
            ListNode tmpValue;
            if (sum >= 10) {
                counter = 1;
                tmpValue = new ListNode(sum - 10);
            } else {
                counter = 0;
                tmpValue = new ListNode(sum);
            }
            if (current == null) {
                current = tmpValue;
                result = current;
            } else {
                current.next = tmpValue;
                current = current.next;
            }
            val1 = val1 != null ? val1.next : null;
            val2 = val2 != null ? val2.next : null;
        }
        return result;

    }

}
