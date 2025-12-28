class Solution {
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int coloumn = matrix[0].length;
        int[][] transpose = new int[coloumn][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<coloumn;j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
}