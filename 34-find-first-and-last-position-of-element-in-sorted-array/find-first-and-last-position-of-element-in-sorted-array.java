class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = firstocc(nums,target);
        int second = secondocc(nums,target);
        return new int[]{first,second};
    }
    public int firstocc(int[] nums,int target){
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target){
                ans = mid;
                high = mid - 1;
            }else if(nums[mid] > target){
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public int secondocc(int[] nums,int target){
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target){
                ans = mid;
                low = mid + 1;
            }else if(nums[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}