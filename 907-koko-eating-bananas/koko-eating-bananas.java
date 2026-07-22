class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = max(piles);
        while(low <= high){
            int mid = low+(high-low)/2;
            long time = caltime(piles,mid);
            if(time <= h){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
    private int max(int[] piles){
        int m = 0;
        for(int num : piles){
            m = Math.max(m,num);
        }
        return m;

    }
    private long caltime(int[] piles,int mid){
        long t = 0;
        for(int n : piles){
            t += ((long)n + mid - 1) / mid;
        }
        return t;
    }
}