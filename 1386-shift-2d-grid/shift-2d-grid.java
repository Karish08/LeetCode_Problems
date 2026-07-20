class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        k = k % (m*n);
        for(int q=0; q<k; q++){
            int last = grid[m-1][n-1];
            for(int i=m-1; i>=0; i--){
                for(int j=n-1; j>=0; j--){
                    if(i != 0 && j == 0){
                        grid[i][j] = grid[i-1][n-1];
                        break;
                    }
                    else if(i == 0 && j == 0) grid[0][0] = last;
                    else grid[i][j] = grid[i][j-1];
                }
            }            
        }
        List<List<Integer>> ak = new ArrayList<>();
        for(int i=0; i<m; i++){
            List<Integer> kb = new ArrayList<>();
            for(int j=0; j<n; j++){
                kb.add(grid[i][j]);
                // System.out.print(grid[i][j]+" ");
            }
            ak.add(kb);
            // System.out.println();
        }return ak;
    }
}