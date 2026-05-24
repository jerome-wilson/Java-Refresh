package com.java.basics.dailypractice.day20;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class MaximumDepthBinaryTreeLogic {
// LeetCode #104, Difficulty: Easy
    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return 1 + Math.max(leftDepth, rightDepth);
    }
}
