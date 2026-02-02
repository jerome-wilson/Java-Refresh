package com.java.basics.leetcode.linkedlist;

public class LinkedListTraversalMain {
    public static void main(String[] args) {
       ListNode head = new ListNode(10);
       head.next = new ListNode(20);
       head.next.next = new ListNode(30);
       head.next.next.next = new ListNode(40);
       head.next.next.next.next = new ListNode(50);

       MiddleNode middleNode = new MiddleNode();
       ListNode middle = middleNode.middleNodeLogic(head);
       System.out.println("Middle node value "+middle.val);

       ListNode current = head;
       while (current != null) {
        System.out.print(current.val+" ");
            current = current.next;
       }
    }
    
}
