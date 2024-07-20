/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     Set<Integer> to_delete_set;
    List<TreeNode> res;
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        to_delete_set = new HashSet<>();
        res = new ArrayList<>();
        for (int i : to_delete)
            to_delete_set.add(i);
        helper(root, true);
        return res;
    }

    private TreeNode helper(TreeNode node, boolean is_root) {
        if(node==null)
            return null; //if we came to NULL, we will return NULL ofcourse.

        boolean deleteNode = to_delete_set.contains(node.val);
        boolean isChildNodeTheRootNode = deleteNode;//as the child Nodes will be the new node since this current node is now deleted.
        
        if(is_root && !deleteNode){
            //is_root tells if basically this should be the root node or not. think recursively. now if we delete this current node, then the child nodes of this node will be the root node. so we will pass the value of deleteNode boolean below to is_root for the child node.
            //also if this is the root node and we are NOT deleting this node, then only we will add it to the list. if it is the root node lets say (we deleted the root above) and also we delete it, then this will be null and what is the use of adding it to the list?
            res.add(node);
        }

        node.left =  helper(node.left, isChildNodeTheRootNode);
        node.right = helper(node.right, isChildNodeTheRootNode);

        if(deleteNode)
            return null;//if we are deleting this node, then this would go as NULL !

        return node;
    }
}