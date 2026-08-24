package com.java.basics.dailypractice.day65;

public class ConstructBinaryTreeFromPreorderInorderMain {

    public static void main(String[] args) {

        ConstructBinaryTreeFromPreorderInorderLogic obj = 
                new ConstructBinaryTreeFromPreorderInorderLogic();

        // Test case: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        TreeNode root = obj.buildTree(preorder, inorder);

        // Print tree structure
        System.out.println("Root: " + root.val); // Expected: 3
        System.out.println("Left: " + root.left.val); // Expected: 9
        System.out.println("Right: " + root.right.val); // Expected: 20
        System.out.println("Right.Left: " + root.right.left.val); // Expected: 15
        System.out.println("Right.Right: " + root.right.right.val); // Expected: 7
    }
}
