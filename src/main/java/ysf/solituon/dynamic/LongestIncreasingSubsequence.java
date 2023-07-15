package ysf.solituon.dynamic;

public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {

        if (nums.length < 2) return 1;

        int[] arr = new int[nums.length + 1];
        arr[arr.length - 2] = 1;

        int tempMinIndex;
        int rt = 0;

        for (int i = nums.length - 2; i >= 0; i--) {
            tempMinIndex = nums.length;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i] && arr[j] > arr[tempMinIndex]) {
                    tempMinIndex = j;
                }
            }
            arr[i] = arr[tempMinIndex] + 1;
            if (rt < arr[i])
                rt = arr[i];
        }


        return rt;
    }
}
