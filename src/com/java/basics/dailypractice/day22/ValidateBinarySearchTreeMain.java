package com.java.basics.dailypractice.day22;
public class ValidateBinarySearchTreeMain {

    public static void main(String[] args) {

        /*
                2
               / \
              1   3
        */

        TreeNode root = new TreeNode(2);

        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        ValidateBinarySearchTreeLogic obj =
                new ValidateBinarySearchTreeLogic();

        boolean result = obj.isValidBST(root);

        System.out.println("Is Valid BST: " + result);
    }
}