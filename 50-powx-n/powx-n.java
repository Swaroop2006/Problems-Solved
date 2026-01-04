class Solution {
    public double myPow(double x, int n) {
        if(x==1 || x==0){
            return x;
        }
        if(n == Integer.MIN_VALUE){
            x = x * x;
            n = n/2;
        }
        int temp = n;
        double ans = 1.0;
        n = Math.abs(n);
        while(n>0){
            if(n%2!=0){
                n = n-1;
                ans = ans*x;
            }
            else{
                x=x*x;
                n=n/2;
            }
        }
        if(temp<0){
            return 1.0/ans;
        }
        return ans;
        
    }
}