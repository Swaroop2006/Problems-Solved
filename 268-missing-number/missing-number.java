class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        int hi = 0;
        for(int i=0;i<nums.length;i++){
            hi = hi + nums[i];
        }
        return sum - hi;
    }
}