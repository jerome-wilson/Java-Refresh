package com.java.basics.dailypractice.day6;

public class LinkedListCycleLogic {
    //LeetCode #141, Difficulty: Easy

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static boolean hasCycle(ListNode head) {

        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // 1 step
            fast = fast.next.next;     // 2 steps

            if (slow == fast) {
                return true;           // cycle detected
            }
        }

        return false; // reached end → no cycle
    }
}
