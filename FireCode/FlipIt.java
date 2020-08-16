public static void flipItVerticalAxis(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int temp;
        for(int i=0;i<row;i++) {
        for(int j=0;j<col/2;j++) {
        temp = matrix[i][j];
        matrix[i][j] = matrix[i][col-1];
        matrix[i][col-1] = temp;
        }
        }
        }