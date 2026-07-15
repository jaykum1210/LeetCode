class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;//2
        int cols = matrix[0].length;//3

        int[][] transposedMatrix = new int[cols][rows];

        for(int row = 0; row < transposedMatrix.length; row++ ){
            for(int col = 0; col < transposedMatrix[row].length; col++){
                transposedMatrix[row][col] = matrix[col][row];
            }
        }
       return transposedMatrix;
    }
}