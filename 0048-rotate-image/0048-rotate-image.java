class Solution {
    public void rotate(int[][] matrix) {
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<i;j++){
                matrix[i][j] = matrix[i][j] + matrix[j][i];
                matrix[j][i] = matrix[i][j] - matrix[j][i];
                matrix[i][j] = matrix[i][j] - matrix[j][i];
            }
        }
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length/2;j++){
                matrix[i][j] = matrix[i][j] + matrix[i][matrix[0].length - j - 1];
                matrix[i][matrix[0].length - j - 1] = matrix[i][j] - matrix[i][matrix[0].length - j - 1];
                matrix[i][j] = matrix[i][j] - matrix[i][matrix[0].length - j - 1];
            }
        }
    }
}