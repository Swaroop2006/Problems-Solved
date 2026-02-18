class Solution {
    public int smallestNumber(int n) {
        String bin = Integer.toBinaryString(n);
        if(!bin.contains("0")){
            return n;
        }
        int len = bin.length();
        return (1 << len) - 1;

    }
}