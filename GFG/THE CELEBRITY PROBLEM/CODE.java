class Solution {
    // Function to find if there is a celebrity in the party or not.
    public int celebrity(int mat[][]) {
        int partyMembers = mat.length;
        
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        
        int[] inorder = new int[partyMembers];
        Arrays.fill(inorder, 0);
        
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat.length; j++){
                if(mat[i][j]==1){
                    inorder[j]++;
                    inorder[i]--;
                }
            }
        }
        
        for(int i=0; i<partyMembers; i++){
            if(inorder[i]==partyMembers-1)
                return i;
        }
        
        return -1;
    }
}