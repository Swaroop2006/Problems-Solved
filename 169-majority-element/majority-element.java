class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            if(sum == 0){
                candidate = nums[i];
            }
            if(candidate == nums[i]){
                sum++;
            }else{
                sum--;
            }
        }
        return candidate;
    }
}