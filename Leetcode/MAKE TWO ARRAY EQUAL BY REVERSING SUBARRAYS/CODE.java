class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        //this is BUBBLE SORT only.


        for(int i=0; i<target.length; i++){
            hashMap.put(target[i], hashMap.getOrDefault(target[i], 0) + 1);
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) - 1);
        }

        // for(int i=0; i<arr.length; i++){
        //     hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) - 1);
        // }

        for(Map.Entry<Integer, Integer> entry: hashMap.entrySet()){
            if(entry.getValue()!=0)
                return false;
        }

        return true;
    }
}