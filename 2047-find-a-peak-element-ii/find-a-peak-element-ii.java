class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int low = 0;
        int high = m - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            int maxRow = maxElement(mat, mid);
            int left = (mid - 1 >= 0) ? mat[maxRow][mid - 1] : -1;
            int right = (mid + 1 < m) ? mat[maxRow][mid + 1] : -1;
            if(mat[maxRow][mid] > left && mat[maxRow][mid] > right){
                return new int[]{maxRow, mid};
            }
            else if(left > mat[maxRow][mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return new int[]{-1,-1};
    }

    private int maxElement(int[][] mat, int col){
        int row = 0;
        for(int i=1;i<mat.length;i++){
            if(mat[i][col] > mat[row][col]){
                row = i;
            }
        }

        return row;
    }
}