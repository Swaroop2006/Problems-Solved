class Solution {
    public int splitArray(int[] nums, int k) {
        int low = max(nums);
        long high = sum(nums);
        while(low <= high){
            long mid = low  + (high - low)/2;
            int parts = countp(nums,mid);
            if(parts <= k){
                high = mid - 1;
            }else{
                low = (int)mid + 1;
            }
        }
        return low;
    }
    private int countp(int[] nums,long limit){
        int part = 1;
        long csum = 0;
        for(int n : nums){
            if(csum + n <= limit){
                csum = csum + n;
            }else{
                part++;
                csum = n;
            }
        }
        return part;

    }
    private int max(int[] nums){
        int m = Integer.MIN_VALUE;
        for(int j : nums){
            m = Math.max(m,j);
        }
        return m;
    }
    private long sum(int[] nums){
        long s = 0;
        for(int i : nums){
            s = s + i;
        }
        return s;
    }
}