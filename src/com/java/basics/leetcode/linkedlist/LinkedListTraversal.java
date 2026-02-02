package com.java.basics.leetcode.linkedlist;

public class LinkedListTraversal {
    public static void main(String[] args) {
       ListNode head = new ListNode(10);
       head.next = new ListNode(20);
       head.next.next = new ListNode(30);
       head.next.next.next = new ListNode(40);

       ListNode current = head;
       while (current != null) {
        System.out.println(current.val);
            current = current.next;
       }
    }
    
}
