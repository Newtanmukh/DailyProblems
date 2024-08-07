class Solution {
    // Should return true if there is a triplet with sum equal
    // to x in arr[], otherwise false
    public static boolean find3Numbers(int arr[], int n, int x) {
        Arrays.sort(arr);
        
        boolean found = false;
        for(int i=0; i<n-2; i++){
            int left = i+1;
            int right = n-1;
            
            
            while(left < right){
                int sum = arr[i] + arr[left] + arr[right];
                if(sum==x){
                    found = true;
                    return found;
                }else if(sum > x){
                    right--;
                }else{
                    left++;
                }
            }
        }
        
        return found;
    }
}