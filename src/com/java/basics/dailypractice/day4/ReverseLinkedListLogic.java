package com.java.basics.dailypractice.day4;
//LeetCode #206, Difficulty: Easy
public class ReverseLinkedListLogic {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextTemp = current.next; // store next
            current.next = prev;              // reverse link
            prev = current;                   // move prev forward
            current = nextTemp;               // move current forward
        }

        return prev;
    }
}
