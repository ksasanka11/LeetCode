class Solution {
    public int removeDuplicates(int[] nums) {
        int slow=0, fast=0, count=1;
        while(fast<nums.length){
            if(nums[slow] != nums[fast]){
                slow++;
                nums[slow] = nums[fast];
                count++;
            }
            fast++;
        }
        return count;
    }
}