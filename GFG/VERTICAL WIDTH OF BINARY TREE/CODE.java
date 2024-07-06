class Solution {
    // Function to find the vertical width of a Binary Tree.
    
    Integer maxi = Integer.MIN_VALUE;
    Integer mini = Integer.MAX_VALUE;
    
    public void dfs(Node root, int val){
        if(root==null)
            return;
            
        maxi = Math.max(maxi, val);
        mini = Math.min(mini, val);
        
        dfs(root.left, val-1);
        dfs(root.right, val+1);
    }
    
    public int verticalWidth(Node root) {
        if(root==null)
            return 0;
        
        dfs(root, 0);
        
        return maxi-mini+1;
    }
}