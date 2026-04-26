package com.java.basics.dailypractice.day11;

public class BestTimeToBuySellStockMain {

    public static void main(String[] args) {

        BestTimeToBuySellStockLogic obj = new BestTimeToBuySellStockLogic();

        int[] prices = {7,1,5,3,6,4};

        int result = obj.maxProfit(prices);

        System.out.println("Maximum Profit: " + result);
    }
}
