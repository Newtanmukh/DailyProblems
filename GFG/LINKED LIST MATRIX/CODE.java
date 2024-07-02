class GFG
{
    
    static Node dfs(int i, int j, int row, int col, int[][] arr){
        if(i>=row||j>=col)
            return null;
            
        Node node = new Node(arr[i][j]);
        node.right =  dfs(i, j+1, row, col, arr);
        node.down =  dfs(i+1, j, row, col, arr);
        
        return node;
    }
    
    static Node construct(int arr[][],int n)
    {
       return dfs(0, 0, n, arr[0].length, arr);
    }
}