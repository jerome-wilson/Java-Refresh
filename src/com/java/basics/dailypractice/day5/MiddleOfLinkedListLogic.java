package com.java.basics.dailypractice.day5;

public class MiddleOfLinkedListLogic {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         // moves 1 step
            fast = fast.next.next;    // moves 2 steps
        }

        return slow;
    }
}
