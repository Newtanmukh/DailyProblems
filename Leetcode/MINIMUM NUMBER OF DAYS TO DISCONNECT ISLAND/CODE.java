class Solution {
    public int minDays(int[][] grid) {

        if(noOfIsland(grid)!=1){
            return 0;
        }
        
          for(int i=0; i<grid.length; i++)
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1){

                    grid[i][j] = 0;

                    if(noOfIsland(grid)!=1){
                        return 1;
                    }
                    grid[i][j] = 1;
            }
        }

        return 2;

    }

    public int noOfIsland(int[][] grid){
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int num = 0;

        for(int i=0; i<grid.length; i++)
            for(int j=0; j<grid[0].length; j++){
                if(!visited[i][j] && grid[i][j]==1){
                    num++;
                    dfs(i, j, grid, visited);     
            }
        }

        return num;
    }

    public void dfs(int row, int col, int[][] grid, boolean[][] visited){
            if(!isValid(row, col, grid))
                return;

            if(visited[row][col])
                return;

            visited[row][col] = true;

            dfs(row + 1, col, grid, visited);
            dfs(row - 1, col, grid, visited);
            dfs(row , col + 1, grid, visited);
            dfs(row , col - 1, grid, visited);
    }

    public boolean isValid(int x, int y, int[][] grid){
        int numRows = grid.length;
        int numCols = grid[0].length;
        
        if(x>=numRows || x < 0 || y>=numCols || y<0)
            return false;

        if(grid[x][y]!=1)
            return false;

        return true;
    }
}