 public Node removeAllDuplicates(Node head) {
       LinkedHashMap <Integer, Integer> hashMap = new LinkedHashMap <>();
       
       Node temp = head;
       
       while(temp!=null){
           Integer data = temp.data;
           hashMap.put(data, hashMap.getOrDefault(data, 0) + 1);
           temp = temp.next;
       }
       
       Node root = new Node(0);
       
       Node ret = root;
       for(Map.Entry<Integer, Integer> mapElement : hashMap.entrySet()){
           if(mapElement.getValue()==1){
                root.next = new Node(mapElement.getKey());
                root = root.next;
           }
       }
       return ret.next;
    }