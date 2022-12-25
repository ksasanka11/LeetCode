import java.util.HashMap;
import java.lang.Math;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map  = new HashMap<>();
        int[] result = new int[2]; 
        // for(int i=0; i<nums.length; i++){
        //     map.put(nums[i], i);
        // }

        for(int i=0; i<nums.length; i++){
            int rem = target-nums[i];
            if(map.containsKey(rem) && map.get(rem) != i){
                result[0] = map.get(rem);
                result[1] = i;
                break;
            }
            map.put(nums[i], i);
        }

        return result;
    }
}