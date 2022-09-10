class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int count=0 ;
        int max_area = 0 ;
        for(int i = 0 ; i< grid.length ; i++){
            for(int j = 0 ; j<grid[0].length ; j++){
                if(grid[i][j]!='0'){
                    int area = dfs(i,j,grid);
                    max_area = Math.max(area,max_area);
                    count++;
                }
            }
        }
        return max_area;
    }
      
    
    public int dfs(int i , int j , int [][] grid){
            if(i<0||j<0||i>= grid.length||j>= grid[0].length||grid[i][j]==0){
                return 0 ;
            }
        grid[i][j]=0;
       int a1 = dfs(i+1,j,grid);int a2 =dfs(i-1,j,grid);
        int a3 =dfs(i,j+1,grid);int a4 =dfs(i,j-1,grid);
        return a1+a2+a3+a4+1;
        
    }
    
    
    
    
    
    
    
    
    
    
    
}