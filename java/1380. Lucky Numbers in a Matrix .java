class Solution {
    // Solution is O(n^2) but the problem stated that there would never be more than 50 elements per row or col, runtime isn't critical in this problem.
    public List<Integer> luckyNumbers (int[][] matrix) {
        
        Set<Integer> rowMins = new HashSet<>();
        Set<Integer> colMaxs = new HashSet<>();
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int row = 0; row < matrix.length; row++){ // traverse the rows
            for(int col = 0; col < matrix[row].length; col++){
                min = Math.min(matrix[row][col], min);
            }
            rowMins.add(min);
            min = Integer.MAX_VALUE;
        }
        
        for(int col = 0; col < matrix[0].length; col++){ // traverse the cols
            for(int row = 0; row < matrix.length; row++){
                max = Math.max(matrix[row][col], max);
            }
            colMaxs.add(max);
            max = Integer.MIN_VALUE;
        }
        
        rowMins.retainAll(colMaxs); // get the intersection of the two sets
        return new ArrayList<Integer>(rowMins);
    }
}
