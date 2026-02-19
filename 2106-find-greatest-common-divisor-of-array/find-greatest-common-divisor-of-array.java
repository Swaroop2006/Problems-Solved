class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int l = nums[0];
        int h = nums[nums.length-1];
        while(h != 0){
            int temp = h;
            h = l%h;
            l = temp;
        }
        return l;

    }
}