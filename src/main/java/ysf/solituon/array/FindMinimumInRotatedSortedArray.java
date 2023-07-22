package ysf.solituon.array;

public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        if(nums.length==1)
            return nums[0];


        int right = nums[nums.length-1];
        int left = nums[0];

        if(left<right) return left;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<left) return left;
            left = nums[i];
            if(nums[nums.length-1-i]>right) return right;
            right = nums[nums.length-1-i];
        }
        return -1;
    }
}

//[3,4,5,1,2]
