class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(digitsum(nums[i]) == i){
                return i;
            }
        }
        return -1;
    }
    private int digitsum(int num){
        int sum = 0;
        while(num > 0){
            int dig = num%10;
            sum = sum + dig;
            num = num/10;
            
        }
        return sum;
    }
}