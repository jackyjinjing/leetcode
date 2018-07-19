package com.study.jinjing.leetcode.primaryalgorithm.array;

/**
 * @author qilong.jj
 * @date 2018/7/19 上午10:39
 */
public class MaxProfit {

    public int maxProfit(int[] prices) {
        if(prices.length == 0) {
            return 0;
        }

        int maxProfit = 0;
        int buyerIndex = 0;
        int tradeTimes = 0;


        for (int index = 0; index < prices.length - 1; index++) {
            if(prices[index+1] < prices[index]){
                int profit = prices[index] - prices[buyerIndex];
                if(profit > 0){
                    maxProfit += profit;
                }
                buyerIndex = index+1;
                tradeTimes++;
            }
        }

        //if tradeTimes equals zero,it means the prices is sorted
        if(tradeTimes ==0){
            return prices[prices.length-1] - prices[0];
        }

        return maxProfit;
    }
}
