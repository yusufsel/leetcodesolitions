package ysf;

import ysf.solituon.array.FindMinimumInRotatedSortedArray;
import ysf.solituon.array.MaximumProductSubarray;
import ysf.solituon.array.MaximumSubarrayNotMe;
import ysf.solituon.dynamic.ClimbingStairs;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        LocalDateTime t1 = LocalDateTime.now();

        for(int i = 1;i<9999999;i++)
        System.out.println(new ClimbingStairs().climbStairs2(i));

        System.out.println(ChronoUnit.SECONDS.between(t1, LocalDateTime.now()));

    }
}

//  3,-1,4
//  +  - -