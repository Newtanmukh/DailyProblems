 Node prev=null;
    public void populateNext(Node root) {
        if(root==null)
            return;
        
        populateNext(root.right);
        root.next=prev;
        prev=root;
        populateNext(root.left);
    }