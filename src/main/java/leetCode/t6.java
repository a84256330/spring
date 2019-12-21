package leetCode;

import org.junit.jupiter.api.Test;

/**
 *
 */
public class t6 {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE, imax = 1, imin = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0){
                imax = imax^imin;
                imin = imax^imin;
                imax = imax^imin;
            }
            imax = Math.max(imax*nums[i], nums[i]);
            imin = Math.min(imin*nums[i], nums[i]);

            max = Math.max(max, imax);
        }
        return max;
    }

    @Test
    public void test(){

        int[] nums = {2,3,-2,4};
        System.out.println(maxProduct(nums));

    }
}
