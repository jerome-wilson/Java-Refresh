package com.java.basics.dailypractice.day5;

public class MiddleOfLinkedListMain {

    public static void main(String[] args) {

        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        MiddleOfLinkedListLogic.ListNode head =
                new MiddleOfLinkedListLogic.ListNode(1);
        head.next = new MiddleOfLinkedListLogic.ListNode(2);
        head.next.next = new MiddleOfLinkedListLogic.ListNode(3);
        head.next.next.next = new MiddleOfLinkedListLogic.ListNode(4);
        head.next.next.next.next = new MiddleOfLinkedListLogic.ListNode(5);
        head.next.next.next.next.next = new MiddleOfLinkedListLogic.ListNode(6);

        MiddleOfLinkedListLogic.ListNode middle =
                MiddleOfLinkedListLogic.middleNode(head);

        System.out.println("Middle node value: " + middle.val);
    }
}
