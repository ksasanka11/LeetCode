class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        num_i = {}
        for i in range(len(nums)):
            num_i[nums[i]] = i
        for k in range(len(nums)):
            rem = target-nums[k]
            if rem in num_i.keys() and k != num_i[rem]:
                return [k, num_i[rem]]