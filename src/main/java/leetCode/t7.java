package leetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ma
 * @version 1.0 {2019/12/23}
 */
public class t7 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException(("No two sum solution"));
    }
}
