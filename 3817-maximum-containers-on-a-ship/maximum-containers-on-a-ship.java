class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        n = n*n;
        int wt = maxWeight/w;
        return Math.min(n,wt);

    }
}