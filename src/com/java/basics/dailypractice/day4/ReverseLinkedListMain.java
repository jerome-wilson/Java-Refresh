package com.java.basics.dailypractice.day4;

public class ReverseLinkedListMain {
    public static void main(String[] args) {

        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5
        ReverseLinkedListLogic.ListNode head =
                new ReverseLinkedListLogic.ListNode(1);
        head.next = new ReverseLinkedListLogic.ListNode(2);
        head.next.next = new ReverseLinkedListLogic.ListNode(3);
        head.next.next.next = new ReverseLinkedListLogic.ListNode(4);
        head.next.next.next.next = new ReverseLinkedListLogic.ListNode(5);

        ReverseLinkedListLogic.ListNode reversed =
                ReverseLinkedListLogic.reverseList(head);

        // Print reversed list
        ReverseLinkedListLogic.ListNode current = reversed;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
