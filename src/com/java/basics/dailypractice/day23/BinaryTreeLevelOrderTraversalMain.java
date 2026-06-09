package com.java.basics.dailypractice.day23;

import java.util.List;

public class BinaryTreeLevelOrderTraversalMain {

    public static void main(String[] args) {

        /*
                  3
                 / \
                9  20
                  /  \
                 15   7
        */

        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(9);

        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        BinaryTreeLevelOrderTraversalLogic obj =
                new BinaryTreeLevelOrderTraversalLogic();

        List<List<Integer>> result = obj.levelOrder(root);

        System.out.println(result);
    }
}
