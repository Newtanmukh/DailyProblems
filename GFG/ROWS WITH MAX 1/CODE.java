class Solution {
    
    Integer maxRow ;
    
    public Integer retNumberOfOnesForARow(int[] a){
        if(a.length==0)
            return 0;
            
        int low = 0;
        int high = a.length - 1;
        int firstOneIndex = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            
            if(a[mid]==1){
                firstOneIndex = mid;
                high = mid - 1 ;
            }else{
                low = mid + 1;
            }
        }
        
        if(firstOneIndex < 0)
            return 0;
            
            // System.out.println(firstOneIndex);
            
        return a.length - firstOneIndex;
    }
    
    public int rowWithMax1s(int arr[][]) {
        int length = arr.length;
        maxRow = -1;
       Integer maxIndex = -1;
        
        for(int i=0; i<arr.length; i++){
            // maxRow = Math.max(maxRow, retNumberOfOnesForARow(arr[i]));
            Integer numberOfOnes =  retNumberOfOnesForARow(arr[i]);
            if(numberOfOnes > maxRow){
                maxRow = numberOfOnes;
                maxIndex = i;
            }
        }
        
        if(maxRow==0)
            return -1;
        
        return maxIndex;
        
    }
}