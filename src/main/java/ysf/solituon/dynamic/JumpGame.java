package ysf.solituon.dynamic;

public class JumpGame {
    public boolean canJump(int[] nums) {
        if(nums.length==1) return true;
        int tryToJumpIndex = nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i]>=tryToJumpIndex) tryToJumpIndex = i;
        }
        return tryToJumpIndex==0;
    }
}


//   [2,3,1,1,4]

