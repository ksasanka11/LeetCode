class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] res = new int[nums.length];
        int p =0;
        for(int i=nums.length-k; i<nums.length; i++) {
            res[p] = nums[i];
            p++;
        }
        for(int i=0; i<nums.length-k; i++) {
            res[p] = nums[i];
            p++;
        }
        for(int i=0; i<nums.length; i++) {
            nums[i] = res[i];
        }
    }
}