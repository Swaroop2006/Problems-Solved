class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n==0 || n<2){
            return 0;
        }
        int min = prices[0];
        int max = 0;
        for(int i=1;i<n;i++){
            min = Math.min(prices[i],min);
            int profit = prices[i] - min;
            max = Math.max(max,profit);
        }

        return max;
    }
}