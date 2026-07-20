class Solution {
        int start = 0;
        int maxlen = 0;
    public String longestPalindrome(String s) {
        if(s.length() == 0){
            return "";
        }
        for(int i=0;i<s.length();i++){
            expand(s,i,i);
            expand(s,i,i+1);
        }
        return s.substring(start,start+maxlen);

    }
    private void expand(String s,int left,int right){
        while(left>=0 && right <s.length() && s.charAt(left) == s.charAt(right)){
            right++;
            left--;
        }
        int len = right - left - 1;
        if(len > maxlen){
            maxlen = len;
            start = left + 1;
        }
    }
}