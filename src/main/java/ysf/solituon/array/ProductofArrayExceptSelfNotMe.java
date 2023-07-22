package ysf.solituon.array;

public class ProductofArrayExceptSelfNotMe {
    public int[] productExceptSelf(int[] nums) {

        int[] rt = new int[nums.length];
        int product = 1;

        for(int i = 0;i<nums.length;i++){
            product *= nums[i];
            rt[i] = product;
        }

        product = 1;
        for(int i=rt.length-1;i>0;i--){
            rt[i] = rt[i-1]*product;
            product *= nums[i];
        }
        rt[0] = product;
        return rt;
    }
}


//   [1,2,3,4]

//    2,3,4   1,3,4   1,2,4   1,2,3