class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        while(n!=1){
        if(seen.contains(n)){
            return false;
        }
        seen.add(n);
        n = sumofsqure(n);
        }
        return true;

    }
    public int sumofsqure(int n){
        int sum = 0;
        while(n>0){
            int dig = n%10;
            sum = sum + dig*dig;
            n = n/10;
        }
        return sum;
    }
}