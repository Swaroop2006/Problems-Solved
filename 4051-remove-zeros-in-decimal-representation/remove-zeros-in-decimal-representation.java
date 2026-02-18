class Solution {
    public long removeZeros(long n) {
        String str = Long.toString(n);
        str = str.replace("0","");
        return Long .parseLong(str);
    }
}