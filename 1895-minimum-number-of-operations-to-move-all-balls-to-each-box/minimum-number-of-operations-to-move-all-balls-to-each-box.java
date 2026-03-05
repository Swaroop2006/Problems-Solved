class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            int opp = 0;
            for(int j=0;j<n;j++){
                if(boxes.charAt(j) == '1'){
                    opp = opp + Math.abs(i - j);
                }
            }
            arr[i] = opp;
        }
        return arr;
    }
}