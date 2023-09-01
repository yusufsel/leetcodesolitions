package ysf.solituon.dynamic;


public class ClimbingStairs {


    int[] memo = new int[45];

    public int climbStairs(int n) {

        if (memo[n] != 0) return memo[n];

        if (n == 1)
            return 1;
        else if (n == 2)
            return 2;

        memo[n] = climbStairs(n - 1) + climbStairs(n - 2);

        return memo[n];
    }



    public int climbStairs2(int n) {
        int nMinus1Value=0;
        int nValue=1;

        for (int i=1;i<=n;i++) {
            int temp = nValue;
            nValue += nMinus1Value;
            nMinus1Value = temp;
        }

        return nValue;
    }


}
