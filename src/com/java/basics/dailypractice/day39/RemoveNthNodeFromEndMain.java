package com.java.basics.dailypractice.day39;

public class RemoveNthNodeFromEndMain {

    public static void main(String[] args) {

        RemoveNthNodeFromEndLogic obj = new RemoveNthNodeFromEndLogic();

        // Test case: [1,2,3,4,5], n = 2
        // Remove 4, result: [1,2,3,5]
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = obj.removeNthFromEnd(head, 2);

        System.out.print("Result: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        // Expected: 1 2 3 5
    }
}
