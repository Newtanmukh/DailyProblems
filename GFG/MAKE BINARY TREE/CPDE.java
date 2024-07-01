 
    public  Tree convert(Node head, Tree node) {
        if(head==null)
            return null;
            
        List<Tree> nodes = new ArrayList<>();
        Node current = head;
        
        while(current!=null){
            nodes.add(new Tree(current.data));
            current = current.next;
        }
        
        for(int i=0; i<nodes.size(); i++){
            if(2*i+1<nodes.size()){
                nodes.get(i).left = nodes.get(2*i+1);
            }
            
            if(2*i+2<nodes.size()){
                nodes.get(i).right = nodes.get(2*i+2);
            }
        }
        
        return nodes.get(0);
    }