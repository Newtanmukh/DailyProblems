class Solution {


    void merge(int[] nums, int low, int mid, int high){
        int[] tempArray = new int[high-low+1];
        int tempIndex = 0;

        int s1= low;
        int s2= mid+1;

        while(s1<=mid && s2<=high){
            if(nums[s1] > nums[s2]){
                tempArray[tempIndex] = nums[s2];
                tempIndex++;
                s2++; 
            }else{
                tempArray[tempIndex] = nums[s1];
                tempIndex++;
                s1++;
            }
        }

        while(s1 <= mid){
            tempArray[tempIndex] = nums[s1];
            tempIndex++;
            s1++;
        }

        while(s2 <= high){
            tempArray[tempIndex] = nums[s2];
            tempIndex++;
            s2++;
        }
        int j = low;

        for(int i=0; i<tempArray.length; i++){
            nums[j] = tempArray[i];
            j++;
        }
    }

    void mergeSort(int[] nums, int low, int high){
        if(low>=high)
            return;

        int mid = low + (high-low)/2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid+1, high);
        merge(nums, low, mid ,high);
    }

    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }
}