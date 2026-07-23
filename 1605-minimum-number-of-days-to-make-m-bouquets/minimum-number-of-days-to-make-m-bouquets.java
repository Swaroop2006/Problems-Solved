class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k > bloomDay.length){
            return -1;
        }
        int low = findmin(bloomDay);
        int high = findmax(bloomDay);
        while(low<=high){
            int mid = low + (high-low)/2;
            if(possible(bloomDay,mid,m,k)){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    private boolean possible(int[] bloomDay,int day,int m,int k){
        int flowers = 0;
        int b = 0;
        for(int bloom : bloomDay){
            if(bloom <= day){
                flowers++;
            }else{
                flowers = 0;
            }
            if(flowers == k){
                b++;
                flowers = 0;
            }
        }
        return b >= m;
    }
    private int findmax(int[] bloomDay){
        int ma = Integer.MIN_VALUE;
        for(int c : bloomDay){
            ma = Math.max(ma,c);
        }
        return ma;
    }
    private int findmin(int[] bloomDay){
        int mi = Integer.MAX_VALUE;
        for(int x : bloomDay){
            mi = Math.min(mi,x);
        }
        return mi;
    }
}