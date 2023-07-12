package packone;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static void main(String[] args) {
        // Input: [3,2,4] | Target: 6
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
    }
    // O(n^2) Complexity
    static public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return nums;
    }

    // HashMap
   static public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            //Finding the complement
            Integer complementFoundIndex = map.get(nums[i]);
            //If there is one
            if(complementFoundIndex != null){
                return new int[]{i, complementFoundIndex};
            }
            //If not found, add the possible compliment as key and index as value
            map.put(target - nums[i], i);
        }
        return nums;
    }
}
