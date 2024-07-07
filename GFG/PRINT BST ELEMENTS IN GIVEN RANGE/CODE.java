class Solution
{   
    ArrayList<Integer> resultSet ;
    
    void dfs(Node root, int low, int high){
        if(root==null)
            return;
            
        if(root.data >=low && high >= root.data){
            dfs(root.left, low, high);
            resultSet.add(root.data);
            dfs(root.right, low, high);
        }else if(root.data < low){
            dfs(root.right, low, high);
        }else{
            dfs(root.left, low, high);
        }
    }
    
    //Function to return a list of BST elements in a given range.
	public  ArrayList<Integer> printNearNodes(Node root,int low,int high) {
        resultSet = new ArrayList<>();
        
        dfs(root, low, high);
        
        return resultSet;
    }
    
}