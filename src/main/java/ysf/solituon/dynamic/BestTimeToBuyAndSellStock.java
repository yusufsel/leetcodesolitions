package ysf.solituon.dynamic;

import java.util.Stack;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {

        int lastMaxIndex = prices.length - 1;
        int lastMinIndex = 0;

        Stack<Integer> minIndexs = new Stack<>();
        Stack<Integer> maxIndexs = new Stack<>();


        for (int i = 0, j = prices.length - 1; i < prices.length; i++, j--) {
            if (prices[i] < prices[lastMinIndex]) {
                minIndexs.push(lastMinIndex);
                lastMinIndex = i;
            }

            if (prices[j] > prices[lastMaxIndex]) {
                maxIndexs.push(lastMaxIndex);
                lastMaxIndex = j;
            }
        }
        minIndexs.push(lastMinIndex);
        maxIndexs.push(lastMaxIndex);

        int minIndex;
        int maxProfit = 0;
        int tempProfit;

        while (!minIndexs.isEmpty()) {
            minIndex = minIndexs.pop();
            for (Integer maxIndex : maxIndexs) {
                if (minIndex <= maxIndex) {
                    tempProfit = prices[maxIndex] - prices[minIndex];
                    if (tempProfit > maxProfit)
                        maxProfit = tempProfit;
                }
            }

        }


        return maxProfit;

    }
}


