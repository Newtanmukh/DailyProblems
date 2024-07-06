public List<Node> printAllDups(Node root) {
        ArrayList<Node> list = new ArrayList<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        help(root, list, hashMap);
        return list;
    }   
    
    public String help(Node root, ArrayList<Node> list, HashMap<String, Integer> hashMap){
        if(root==null)
            return "*NULL*";
            
        String str= root.data+","+help(root.left,list,hashMap)+","+help(root.right,list,hashMap);
        
        hashMap.put(str, hashMap.getOrDefault(str, 0) + 1);
        
        if(hashMap.get(str)==2)//kabhi na toh kabhi hoga hi.
            list.add(root);
            
        return str;
    }