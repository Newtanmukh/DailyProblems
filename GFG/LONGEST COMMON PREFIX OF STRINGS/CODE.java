class Solution {
    public String longestCommonPrefix(String arr[]) {
        String ans = arr[0];
        int n = arr.length;
        
        for(int i=0; i<n; i++){
            if(arr[i].length() < ans.length()){
                ans = arr[i];
            }    
        }
        
        for(int i=ans.length(); i>0; i--){
            String res = ans.substring(0, i);
            boolean isCommon = true;
            
            for(String l : arr){
                if(!l.startsWith(res)){
                    isCommon = false;
                    break;
                }
            }
            
            if(isCommon)
                return res;
        }
        
        return "-1";
        
        
    }
}