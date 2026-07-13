package com.java.basics.dailypractice.day46;

public class MergeTwoSortedListsMain {

    public static void main(String[] args) {

        MergeTwoSortedListsLogic obj = new MergeTwoSortedListsLogic();

        // Test case: list1 = [1,2,4], list2 = [1,3,4]
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode result = obj.mergeTwoLists(list1, list2);

        System.out.print("Merged: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        // Expected: 1 1 2 3 4 4
    }
}
