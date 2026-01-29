package com.java.basics.leetcode.wealthiestcustomer;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {

        int maxiumWealthSoFar = 0;

        for (int[] customer: accounts) {
            int currentCustomerWealth = 0;
            for (int bank: customer) {
                currentCustomerWealth += bank;
            }
            maxiumWealthSoFar = Math.max(currentCustomerWealth, maxiumWealthSoFar);
        }
        return maxiumWealthSoFar;
    }
}
