class Solution {
    static int countTriplets(int arr[], int n, int l, int r) {
         Arrays.sort(arr);
        
        int countLessThanRPlus1 = 0;
        
        for(int i=0; i<n-2; i++){
            int left = i+1;
            int right = n-1;
            
            while(left<right){
            int sum = arr[left] + arr[i] + arr[right];
             if(sum < r+1){
                    countLessThanRPlus1 = countLessThanRPlus1 + right - left;//left is the leftmostIndex, which is stagnant.
                    left++;
                }else{
                    right--;
                }
            }
        }
        
        int countLessThanL = 0;
        
        for(int i=0; i<n-2; i++){
            int left = i+1;
            int right = n-1;
            while(left<right){
            int sum = arr[left] + arr[i] + arr[right];
             if(sum < l){
                    countLessThanL = countLessThanL + right - left;//left is the leftmostIndex, which is stagnant.
                    left++;
                }else{
                    right--;
                }
            }
        }
        
        return countLessThanRPlus1 - countLessThanL;
    }
}