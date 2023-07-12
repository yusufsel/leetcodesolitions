package ysf.solituon;


public class ClimbingStairs {


    int[] memo = new int[45];

    public int climbStairs(int n) {

        if(memo[n] != 0) return memo[n];

        if(n==1)
            return 1;
        else if(n==2)
            return 2;

        memo[n] = climbStairs(n-1) + climbStairs(n-2);

        return memo[n] ;
    }



}
