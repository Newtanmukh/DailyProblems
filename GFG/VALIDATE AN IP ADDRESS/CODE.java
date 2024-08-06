class Solution {
    
    public boolean isVal(int num){
        if(num >=0 && num<256)
            return true;
        return false;
    }
    
    public boolean isValid(String str) {
        String num = "";
        
            if(str.charAt(0)=='.') 
                return false;    
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            if(ch=='.'){
                if(!isVal(Integer.parseInt(num))){
                    return false;
                }else{
                    num="";
                }
                
                continue;
            }
            
            num = num + ch;
        }
        
        if(!isVal(Integer.parseInt(num))){
            return false;
        }
        
        return true;
    }
}