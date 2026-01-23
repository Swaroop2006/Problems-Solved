class Solution {
    public int arrangeCoins(int n) {
        long low = 1,high = n;
        int ans = 0;
        while(low <= high){
            long mid = low + (high - low)/2;
            long coins = mid*(mid+1)/2;
            if(coins<=n){
                ans = (int) mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return ans;
    }
}