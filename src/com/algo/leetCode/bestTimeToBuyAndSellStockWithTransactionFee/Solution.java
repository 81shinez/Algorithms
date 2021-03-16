package com.algo.leetCode.bestTimeToBuyAndSellStockWithTransactionFee;

class Solution {
//    public int maxProfit(int[] prices, int fee) {
//        int profit = 0;
//        int buyPrice = prices[0];
//
//        for(int idx = 1; idx < prices.length; idx++){
//            // 현재가격 - 내가 산 가격 - 수수료 -> 순이익과 내가 가진 총 수익 중 큰 값
//            profit = Math.max(profit, prices[idx] - buyPrice - fee);
//            // 현재가격 - 순이익 과 내가 산 가격 중 작은 값
//            buyPrice = Math.min(buyPrice, prices[idx] - profit);
//        }
//
//        return profit;
//    }
    public int maxProfit(int[] prices, int fee) {
        // Set initial state.
        int sellState = 0;
        int buyState = -prices[0];

        for(int idx = 1; idx < prices.length; idx++){
            sellState = Math.max(
                    sellState // 판 상태 -> 판 상태
                    , prices[idx]-fee+buyState// 산 상태 -> 판 상태
            );
            buyState = Math.max(
                    sellState - prices[idx]// 판 상태 -> 산 상태
                    , buyState // 산 상태 -> 산 상태
            );
        }

        return Math.max(buyState, sellState);
    }
}

