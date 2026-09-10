package com.java.basics.dailypractice.day75;

public class CoinChangeMain {

    public static void main(String[] args) {

        CoinChangeLogic obj = new CoinChangeLogic();

        // Test case 1: coins = [1,2,5], amount = 11
        // 11 = 5 + 5 + 1 (3 coins)
        int[] coins1 = {1, 2, 5};
        System.out.println("coins=[1,2,5], amount=11: " + obj.coinChange(coins1, 11)); // Expected: 3

        // Test case 2: coins = [2], amount = 3
        // Not possible
        int[] coins2 = {2};
        System.out.println("coins=[2], amount=3: " + obj.coinChange(coins2, 3)); // Expected: -1

        // Test case 3: coins = [1], amount = 0
        int[] coins3 = {1};
        System.out.println("coins=[1], amount=0: " + obj.coinChange(coins3, 0)); // Expected: 0
    }
}
