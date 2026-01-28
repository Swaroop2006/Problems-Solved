class Solution {
    public int countDigits(int num) {
        int ori = num;
        int count = 0;
        while(num > 0){
            int dig = num % 10;
            if(ori % dig == 0){
                count++;
            }
            num = num/10;
        }
        return count;
    }
}