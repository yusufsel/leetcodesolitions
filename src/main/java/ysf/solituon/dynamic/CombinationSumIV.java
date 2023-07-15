package ysf.solituon.dynamic;

public class CombinationSumIV {


    public int combinationSum4(int[] nums, int target) {

        int[] dp = new int[target + 1];
        dp[0] = 1;

        for (int i = 1; i <= target; i++) {
            int temp = 0;
            for (int j = 0; j < nums.length && i >= nums[j]; j++) {
                temp += dp[i - nums[j]];
            }
            dp[i] = temp;
        }

        return dp[target];
    }
}
