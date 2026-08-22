package com.java.basics.dailypractice.day64;

public class KthSmallestElementInBSTMain {

    public static void main(String[] args) {

        KthSmallestElementInBSTLogic obj = new KthSmallestElementInBSTLogic();

        /*
                  3
                 / \
                1   4
                 \
                  2
        */
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);

        System.out.println("1st smallest: " + obj.kthSmallest(root, 1)); // Expected: 1
        System.out.println("2nd smallest: " + obj.kthSmallest(root, 2)); // Expected: 2
        System.out.println("3rd smallest: " + obj.kthSmallest(root, 3)); // Expected: 3
    }
}
