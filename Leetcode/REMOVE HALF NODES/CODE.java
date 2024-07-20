class Solution {
    public Node help(Node root){
        if(root==null)
            return null;
            
        root.left = help(root.left);
        root.right = help(root.right);
        
        if(root.left==null && root.right!=null)
            return root.right;
            
        if(root.left!=null && root.right==null)
            return root.left;
            
        return root;
    }
    
    public Node RemoveHalfNodes(Node root) {
        return help(root);
    }
}