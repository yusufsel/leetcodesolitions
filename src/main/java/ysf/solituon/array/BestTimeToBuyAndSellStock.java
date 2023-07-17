package ysf.solituon.array;


public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {

        if(prices.length<=1) return 0;

        int maxDiff = 0;
        int currentDiff = 0;

        for(int i=1;i<prices.length;i++){
            currentDiff += prices[i] - prices[i-1];

            if(currentDiff < 0)
                currentDiff = 0;

            if(maxDiff<currentDiff)
                maxDiff = currentDiff;
        }

        return maxDiff;
    }
}


