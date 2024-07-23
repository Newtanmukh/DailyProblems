class Solution
{

    
    int sum = 0;
    
    public int dfs(Node root){
        
        if(root==null)
            return 0;
            

            
        int left = dfs(root.left);
        int right = dfs(root.right);
        
    
         
        if(root.left!=null && root.right!=null){
            sum = Math.max(sum, root.data + left + right);
            return root.data + Math.max(left, right);
        }
        
        if(root.left==null && root.right!=null)
            return root.data + right;
            
        //if(root.left!=null && root.right==null)
             return root.data + left;
        
    }
    
     public int maxPathSum(Node root)
    { 
        sum = Integer.MIN_VALUE;
        
        int x = dfs(root);
        
        if(root.left!=null && root.right!=null)
            return sum;
        
        return Math.max(sum, x);
    } 
}