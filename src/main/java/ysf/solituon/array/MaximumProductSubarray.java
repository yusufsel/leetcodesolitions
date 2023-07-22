package ysf.solituon.array;

import java.util.Arrays;
import java.util.Collections;

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {

        int res = Arrays.stream(nums).max().getAsInt();
        int curMax = 1;
        int curMin = 1;

        for(int i=0;i<nums.length;i++){
            int temp = curMax * nums[i];
            curMax = Math.max(nums[i],Math.max(curMax * nums[i],curMin * nums[i]));
            curMin = Math.min(nums[i],Math.min(temp,curMin * nums[i]));
            res = Math.max(res,curMax);
        }
        return res;
    }

    //[2,3,-2,4]
}
