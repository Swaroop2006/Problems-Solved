class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = max(piles);
        while(low <= high){
            int mid = low + (high-low)/2;
            long time = calcu(piles,mid);
            if(time <= h){
                high = mid-1;
            }else{
                low = mid +1;
            }
        }
        return low;
    }
    private int max(int[] piles){
        int m=0;
        for(int n : piles){
            m = Math.max(m,n);
        }
        return m;
    }
    private long calcu(int[] piles,int mid){
        long t =0;
        for(int p : piles){
        t += ((long)p+mid-1)/mid;
        }
    return t;
    }
}