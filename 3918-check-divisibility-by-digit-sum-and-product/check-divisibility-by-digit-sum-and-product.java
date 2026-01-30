class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int mul = 1;
        int temp = n;
        while(n>0){
            int dig = n%10;
            sum = sum + dig;
            mul = mul*dig;
            n = n/10;
        }
        int total = sum+mul;
        return temp%total == 0;
    }
}