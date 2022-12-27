class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j = nums.length-1;
        int[] res = new int[nums.length];
        int p = nums.length-1;
        while(i<=j){
            if(nums[i]*nums[i] > nums[j]*nums[j]){
                res[p] = nums[i]*nums[i];
                i++;
            } else {
                res[p] = nums[j]*nums[j];
                j--;
            }
            p--;
        }
        return res;
    }
}