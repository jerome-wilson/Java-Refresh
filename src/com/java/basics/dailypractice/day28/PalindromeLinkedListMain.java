package com.java.basics.dailypractice.day28;

public class PalindromeLinkedListMain {

    public static void main(String[] args) {

        PalindromeLinkedListLogic obj = new PalindromeLinkedListLogic();

        // Test case 1: [1,2,2,1] - palindrome
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(2);
        head1.next.next.next = new ListNode(1);
        System.out.println("[1,2,2,1]: " + obj.isPalindrome(head1)); // Expected: true

        // Test case 2: [1,2] - not palindrome
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        System.out.println("[1,2]: " + obj.isPalindrome(head2)); // Expected: false
    }
}
