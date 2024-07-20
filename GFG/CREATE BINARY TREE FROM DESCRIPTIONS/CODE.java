class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer, TreeNode> hashMap = new HashMap<>();
        Set<Integer> children = new HashSet<>();

        int size = descriptions.length;

        for(int i=0; i<size; i++){
            int[] arr = descriptions[i];
            int parent = arr[0];
            int child = arr[1];
            int isLeft = arr[2];

            children.add(child);

            TreeNode parentNode = hashMap.getOrDefault(parent, new TreeNode(parent));
            if(isLeft==1){
                parentNode.left = hashMap.getOrDefault(child, new TreeNode(child));
                hashMap.put(child, parentNode.left);
            }else{
                parentNode.right = hashMap.getOrDefault(child, new TreeNode(child));
                hashMap.put(child, parentNode.right);
            }

            hashMap.put(parent, parentNode);
        }
        int root = -1;
        for(int i=0; i<size; i++){
            int[] arr = descriptions[i];
            int parent = arr[0];
            if(!children.contains(parent)){
                root = parent;
                break;
            }
        }

        return hashMap.getOrDefault(root, null);

    }
}