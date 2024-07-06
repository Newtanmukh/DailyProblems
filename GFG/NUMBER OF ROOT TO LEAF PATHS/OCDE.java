 void countPaths(Node root)
    {
    	// Your code here
        Deque<Node> q = new ArrayDeque<>();
    	q.addLast(root);
    	int level = 0;
    	HashMap<Integer, Integer> hashMap = new HashMap<>();
    	
    	while(q.size() > 0){
    	    level = level + 1; // we incremented one level up
    	    int size = q.size();
    	    
    	    for(int i=0; i<size; i++){
    	        Node front = q.peekFirst();
    	        q.removeFirst();
    	        
    	        if(front.left==null && front.right==null){
    	            hashMap.put(level, hashMap.getOrDefault(level, 0) + 1);
    	        }
    	        
    	        if(front.left!=null)
    	            q.addLast(front.left);
    	            
	            if(front.right!=null)
	                q.addLast(front.right);
    	    }
    	}
    	
    	for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            System.out.print(entry.getKey() + " " + entry.getValue() + " $");
        }
    }