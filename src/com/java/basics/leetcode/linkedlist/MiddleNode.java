package com.java.basics.leetcode.linkedlist;

public class MiddleNode {
    public ListNode middleNodeLogic(ListNode head) {
        ListNode middle = head;
        ListNode end = head;
        while (end != null && end.next != null) {
            middle = middle.next;
            end = end.next.next;
        }
        return middle;
    }
}
