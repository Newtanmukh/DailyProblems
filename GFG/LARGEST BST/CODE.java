class Solution{
    
    public class Info{
        int min;
        int max;
        int size;
        
        public Info(int min, int max, int size){
            this.min = min;
            this.max = max;
            this.size = size;
        }
    }
    
    int maxBstSize;
    
    public Info postOrderTraversal(Node root){
        if(root==null){
            return new Info(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
            /* In a binary search Tree, all the nodes on right of the node are greater than the current Node. similarly all the nodes on the left are smaller than the current node.
             * Now the thing is that, for the current node, the current node should be smaller than the SMALLEST element on the right of the subtree. Similarly, the current node should be greater thann the GREATEST Element on the left subtree.
             * Now if it is NULL root, then if it is the left NULL root, then the upper root will check if that node is greater than the greatest element from left. so incase it is left NULL, the max element is INT_MIN.
             * Similarly for the right NULL root, we are setting the smallest to MAX_VALUE so that the node above would become a BST.
             */
        }
        
        Info leftInfo = postOrderTraversal(root.left);
        Info rightInfo = postOrderTraversal(root.right);
        
        int data = root.data;
        
        if(data > leftInfo.max && rightInfo.min > data){
            int currSize = leftInfo.size + rightInfo.size + 1;
            maxBstSize = Math.max(maxBstSize, currSize);
            
            int minimumElement = Math.min(data, leftInfo.min);
            int maximumElement = Math.max(data, rightInfo.max);
            return new Info(minimumElement, maximumElement, currSize);
        }
        
        return new Info(Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
        
    }
    
    int largestBst(Node root)
    {
          maxBstSize = 1;
          postOrderTraversal(root);
          return maxBstSize;
    }
    
}