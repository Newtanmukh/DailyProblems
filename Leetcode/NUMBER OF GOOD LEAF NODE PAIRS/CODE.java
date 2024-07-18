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

    private int numOfGoodPairs;

    private List<Integer> dfs(TreeNode root, int distance){
        if(root==null)
            return new ArrayList<>();

        if(root.left ==null && root.right==null)
            return Arrays.asList(1);

        List<Integer> leftList = dfs(root.left, distance);
        List<Integer> rightList = dfs(root.right, distance);

        for(int left: leftList)
            for(int right: rightList){
                if(left + right <= distance){
                    numOfGoodPairs++;
                }
            }

        List<Integer> parentList = new ArrayList<>();
        for (int lv : leftList) {
            if (lv + 1 <= distance) parentList.add(lv + 1); //basically for all the leafnodes to the left, we are adding 1 to it to include the current node also so that it will be considered as leafNode dist. for the node just abobe.
        }

        for (int rv : rightList) {
            if (rv + 1 <= distance) parentList.add(rv + 1); //basically for all the leafnodes to the right, we are adding 1 to it to include the current node also so that it will be considered as leafNode dist. for the node just abobe.
        }

        return parentList;//now all leafNodes to both the left and right, are all the leafnodes over
    }

    public int countPairs(TreeNode root, int distance) {
            numOfGoodPairs = 0;
            dfs(root, distance);
            return numOfGoodPairs;
    }
}