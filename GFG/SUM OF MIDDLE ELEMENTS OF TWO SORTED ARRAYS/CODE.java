class Solution {
    public int SumofMiddleElements(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        
        int[] arr = new int[m + n];
        int k = 0;
        int i = 0;
        int j = 0;
        
        while(i<m && j<n){
            if(arr1[i] > arr2[j]){
                arr[k] = arr2[j];
                j++;
                k++;
            }else{
                arr[k] = arr1[i];
                i++;
                k++;
            }
        }
        
        int mid = (m+n)/2;
        
        return arr[mid] + arr[mid-1];
        
    }
}