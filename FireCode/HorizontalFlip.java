public static void flipHorizontalAxis(int[][] matrix) {
    int rows = matrix.length;
    int col = matrix[0].length;

    for(int i=0;i<rows/2;i++) {
        for(int j=0;j<col;j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[rows-1-i][j];
            matrix[rows-1-i][j] = temp;
        }
    }
}