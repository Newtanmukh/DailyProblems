 int closing (String s, int pos)
    {
        int n = s.length();
        
         Deque<Character> deque = new ArrayDeque<>();
        
        for(int i=pos+1; i<n; i++){
            char t = s.charAt(i);
            
            if(t=='['){
                deque.addFirst(t);
            }else if(t==']'){
                if(deque.size()==0){
                    return i;
                }
                
                deque.removeFirst();
            }
        }   
        
        return -1;
    }