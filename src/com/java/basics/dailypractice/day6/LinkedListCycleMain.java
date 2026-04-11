package com.java.basics.dailypractice.day6;

public class LinkedListCycleMain {

    public static void main(String[] args) {

        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5
        LinkedListCycleLogic.ListNode head =
                new LinkedListCycleLogic.ListNode(1);
        head.next = new LinkedListCycleLogic.ListNode(2);
        head.next.next = new LinkedListCycleLogic.ListNode(3);
        head.next.next.next = new LinkedListCycleLogic.ListNode(4);
        head.next.next.next.next = new LinkedListCycleLogic.ListNode(5);

        // Creating a cycle: 5 -> 3
        head.next.next.next.next.next = head.next.next;

        boolean result = LinkedListCycleLogic.hasCycle(head);

        System.out.println("Cycle detected: " + result);
    }
}
