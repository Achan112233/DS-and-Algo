class Solution {
    public void rotate(int[][] matrix) {
        // transpose the matrix
        int temp = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = i + 1; j < matrix[i].length; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //this will reverse the rows of the matrix after transposing it.
        //this will iterate through the matrix and swap the elements in the first half of the row with the elements in the second half of the row.
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length/2; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[0].length - j - 1];
                matrix[i][matrix[0].length - j - 1] = temp;
            }
        }
    }
}