package com.java.basics.dailypractice.day67;

import java.util.List;

public class BinaryTreeRightSideViewMain {

    public static void main(String[] args) {

        BinaryTreeRightSideViewLogic obj = new BinaryTreeRightSideViewLogic();

        /*
                  1
                 / \
                2   3
                 \   \
                  5   4
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        List<Integer> result = obj.rightSideView(root);
        System.out.println("Right side view: " + result); // Expected: [1, 3, 4]
    }
}
