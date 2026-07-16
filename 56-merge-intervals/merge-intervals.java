class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        List<int[]> ans = new ArrayList<>();
        ans.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int[] last = ans.get(ans.size() - 1);
            if(intervals[i][0] <= last[1]){
                last[1] = Math.max(last[1],intervals[i][1]);
            }else{
                ans.add(intervals[i]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}