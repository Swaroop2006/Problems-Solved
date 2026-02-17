class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        int sum = 0;
        for(int i=0;i<nums.length-1;i++){
            sum = sum + (max - nums[i]);
        }
        return sum;
    }
}