class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> res = new ArrayList<>();

        int[] minRows = new int[m];
        int[] maxCols = new int[n];

        Arrays.fill(minRows, Integer.MAX_VALUE);
        Arrays.fill(maxCols, Integer.MIN_VALUE);

        for(int i=0; i<m; i++)
            for(int j=0; j<n; j++){
                minRows[i] = Math.min(minRows[i], matrix[i][j]);
                maxCols[j] = Math.max(maxCols[j], matrix[i][j]);
            }

         for(int i=0; i<m; i++)
            for(int j=0; j<n; j++){
                if(minRows[i] == matrix[i][j] && matrix[i][j] == maxCols[j]){
                    res.add(minRows[i]);
                }
            }

            return res;
    }
}