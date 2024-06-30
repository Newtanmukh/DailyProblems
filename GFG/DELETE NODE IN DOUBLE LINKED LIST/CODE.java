 public Node deleteNode(Node head, int x) {
        
        if(head==null||x<=0)
            return head;
            
        Node current = head;
        
        if(x==1){
            head = head.next;
            if(head!=null){
                head.prev = null;
            }
            
            return head;
        }
        
        for(int i=1; current!=null && i<x; i++){
            current = current.next;
        }
        
        
        if (current == null) {
            return head;
        } 
        
        Node leftNode = current.prev;
        Node rightNode = current.next;
        
        if(leftNode!=null)
            leftNode.next = rightNode;
            
        if(rightNode!=null)
            rightNode.prev = leftNode;
            
            
        return head;
        
    }