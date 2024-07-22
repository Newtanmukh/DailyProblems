class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] result = new String[names.length];

        TreeMap<Integer, String> treeMap = new TreeMap<>(Collections.reverseOrder());

        for(int i=0; i<names.length; i++){
            treeMap.put(heights[i], names[i]);   
        }

        int i=0;

        for(Integer x : treeMap.keySet()){
            result[i] = treeMap.get(x);
            i++;
        }

        return result;
    }
}