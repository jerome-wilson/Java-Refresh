package com.java.basics.leetcode.wealthiestcustomer;

public class RichestCustomerWealthMain {
    
    public static void main(String[] args) {
        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1},
            {12, 0, 0},
            {2, 4, 2},
            {10, 2, 2}
        };
        RichestCustomerWealth richestCustomerWealth = new RichestCustomerWealth();
        int result = richestCustomerWealth.maximumWealth(accounts);
        System.out.println("Maximum Wealth: " + result);
    }
}