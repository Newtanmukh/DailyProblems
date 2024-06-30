class Solution {
    static long sumMatrix(long n, long q) {
        //   if (q < 2 || q > 2 * n) {
        //     return 0; // q is out of the possible range
        // }
        
        // long count = 0;
        
        // for(long row  = 1; row <= n; row++ ){
        //     if(q-row>=1 && q-row <=n){
        //         count++;
        //     }
        // }
        
        // return count;
        
        
        long start = Math.max(1L, q-n);
        long end = Math.min(n, q-1);
        
        if(start>end)
            return 0;
            
        return end - start + 1;
        
    }
}