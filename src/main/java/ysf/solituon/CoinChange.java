package ysf.solituon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CoinChange {


    public int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int c : coins) {
                dp[i] = 1 + dp[i - c];
            }
        }


        return -1;
    }


    Map<Integer, Integer> memo = new HashMap<>();


    public int coinChange1(int[] coins, int amount) {

        if (memo.containsKey(amount)) return memo.get(amount);

        if (amount == 0) return 0;

        int[] cases = new int[coins.length];

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                int a = coinChange(coins, amount - coins[i]);
                if (a >= 0) {
                    cases[i] = a + 1;
                    continue;
                }
            }
            cases[i] = -1;
        }

        memo.put(amount, Arrays.stream(cases).filter(value -> value >= 0).sorted().findFirst().orElseGet(() -> -1));
        return memo.get(amount);
    }


}