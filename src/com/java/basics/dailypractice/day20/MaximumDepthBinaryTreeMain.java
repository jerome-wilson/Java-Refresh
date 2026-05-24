package com.java.basics.dailypractice.day20;

public class MaximumDepthBinaryTreeMain {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(9);

        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        MaximumDepthBinaryTreeLogic obj =
                new MaximumDepthBinaryTreeLogic();

        int result = obj.maxDepth(root);

        System.out.println("Maximum Depth: " + result);
    }
}
