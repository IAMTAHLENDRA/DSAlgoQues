class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        if(matrix.length == 0) return new ArrayList<List<Integer>>();
        
        int[][] pacific = new int[matrix.length][matrix[0].length];
        int[][] atlantic = new int[matrix.length][matrix[0].length];
        
        for(int col=0;col<matrix[0].length;col++) {
            dfs(matrix,0,col,Integer.MIN_VALUE,pacific);
            dfs(matrix,matrix.length-1,col,Integer.MIN_VALUE,atlantic);
        }
        
        for(int row=0;row<matrix.length;row++) {
            dfs(matrix,row,0,Integer.MIN_VALUE,pacific);
            dfs(matrix,row,matrix[0].length-1,Integer.MIN_VALUE,atlantic);
        }
        
        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                if(pacific[i][j] == 1 && atlantic[i][j] == 1 ) {
                    LinkedList<Integer> sol = new LinkedList<Integer>();
                    sol.add(i);
                    sol.add(j);
                    ans.add(sol);
                }
            }
        }
        
        return ans;
    }
    
    private static void dfs(int[][] matrix,int row,int col,int preVal,int[][] ocean) {
        if(row<0 || col<0 || row>matrix.length-1 || col>matrix[0].length-1) return;
        
        if(matrix[row][col] < preVal) return;
        
        if(ocean[row][col] == 1) return;
        
        
        ocean[row][col] = 1;
        
        dfs(matrix,row-1,col,matrix[row][col],ocean);
        dfs(matrix,row+1,col,matrix[row][col],ocean);
        dfs(matrix,row,col-1,matrix[row][col],ocean);
        dfs(matrix,row,col+1,matrix[row][col],ocean);
    }
}