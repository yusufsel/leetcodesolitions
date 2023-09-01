package ysf.solituon.array;

import java.util.Collections;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {

        if(nums.length == 1 && nums[0] == target) return 0;


        int leftIndex=0,rightIndex=nums.length;
        boolean leftInc=false,rightDec=false;
        int leftPre = Integer.MIN_VALUE,rightPre=Integer.MAX_VALUE;

        while(leftIndex<rightIndex){




            if(nums[leftIndex]>nums[rightIndex]){
                leftIndex++; rightIndex--;
            }else{
                break;
            }
        }

        return leftIndex;
    }
}

//[4,5,6,7,0,1,2]
