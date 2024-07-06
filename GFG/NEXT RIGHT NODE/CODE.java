class Solution{
	Node nextRight(Node root, int key)
    {
	    Deque<Node> q = new ArrayDeque<>();
	    q.addLast(root);
	    
	    while(q.size() > 0){
	        int len = q.size();
	        
	        for(int i=0; i<len; i++){
	            Node front = q.peekFirst();
	            q.removeFirst();
	            
	            if(front.data==key){
	                if(i==len-1)
	                    return new Node(-1);
                    
                    return q.peekFirst();
	            }
	            
	            if(front.left!=null){
	                q.addLast(front.left);
	            }
	            
	            if(front.right!=null){
	                q.addLast(front.right);
	            }
	        }
	    }
	    
	    return new Node(-1);
    }
}