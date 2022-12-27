class Solution {
    public void moveZeroes(int[] nums) {

        if(nums.length == 1){
            return;
        }

        int zero_count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0) {
                zero_count++;
            }
        }
        int i = 0;
        int j = 0;

        while(i<nums.length && j<nums.length) {
            if(nums[j] != 0){
                nums[i] = nums[j];
                i++;
            }
            j++;
        }

        while(i<nums.length){
            nums[i] = 0;
            i++;
        }
    }
}