package com.java.basics.dailypractice.day21;

import java.util.List;

public class BinaryTreeInorderTraversalMain {

    public static void main(String[] args) {

        /*
                1
                 \
                  2
                 /
                3
        */

        TreeNode root = new TreeNode(1);

        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        BinaryTreeInorderTraversalLogic obj =
                new BinaryTreeInorderTraversalLogic();

        List<Integer> result = obj.inorderTraversal(root);

        System.out.println("Inorder Traversal: " + result);
    }
}