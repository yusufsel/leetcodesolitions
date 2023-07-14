package ysf.solituon;

public class UniquePaths {

    public int uniquePaths(int m, int n) {

            int[][] dp = new int[m+1][n+1];
            dp[1][1] = 1;

            for(int i=1;i<=m;i++){
                for(int j=1;j<=n;j++){
                    dp[i][j] += dp[i][j-1] + dp[i-1][j];
                }
            }

            return dp[m][n];

    }


    //          1 1 1 1  1  1  1
    //          1 2 3 4  5  6  7
    //          1 3 6 10 15 21 28
}
