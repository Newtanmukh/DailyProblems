class Solution
{
    int maxi = Integer.MIN_VALUE;
    
    void dfs(Node root, int parent, int len, boolean start){
        if(root==null)
            return;
            
        if(start==true){
            len++;
        }else{
            if(parent - root.data == -1){
                len++;
            }else{
                len = 1;
            }
        }
        
        if(len>maxi){
            maxi=len;
        }
        
        dfs(root.left, root.data, len, false);
        dfs(root.right, root.data, len, false);
        
    }
    
	public int longestConsecutive(Node root)
    {
        int len = 0;
        dfs(root, -1, len, true);
        if(maxi==1)
            return -1;
        return maxi;
    }
}