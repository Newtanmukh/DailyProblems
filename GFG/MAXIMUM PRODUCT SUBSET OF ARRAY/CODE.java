class Solution {
    
    public long mod = (long)1e9 + 7;
    public long findMaxProduct(List<Integer> arr) {
        
        if(arr.size()==1)
            return new Long(arr.get(0));
        
        int zeroElement = 0;
        int negativeElement = 0;
        int positiveElement = 0;
        for(Integer elm : arr){
            if(elm==0){
                zeroElement++;
            }
                
            if(elm < 0){
                negativeElement++;
            }
            
            if(elm > 0){
                positiveElement++;
            }
        }
        
        if(negativeElement==1)
            {
                if(negativeElement + zeroElement==arr.size())
                    return 0;
                    
            }
            
            if(zeroElement==arr.size())
                return 0;
        
        Collections.sort(arr);
        
        long product = 1;
        
        if(negativeElement %2 == 1){
            long trackNeg = 0;
            for(Integer elm : arr){
                
                if(elm < 0){
                    trackNeg++;
                    if(trackNeg!=negativeElement){
                        product = (product * elm)%mod;
                    }
                }else if(elm!=0){
                    product = (product * elm)%mod;
                }
            }    
        }else{
            for(Integer elm : arr){
                
               if(elm!=0){
                    product = (product * elm) % mod;
                }
            }  
        }
        
        return product;
    }
}