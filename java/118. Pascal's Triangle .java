class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> pascal = new ArrayList<List<Integer>>();
        
        for(int i = 0; i < numRows; i++){
            
            List<Integer> row = new ArrayList<Integer>(i + 1);
            
            while(row.size() < i + 1) row.add(1);
            
            for(int j = 1; j < i; j++){ // filling in the inner part of the rows
                row.set(
                       j, 
                       pascal.get(i - 1).get(j) +
                       pascal.get(i - 1).get(j - 1) 
                       );
            }
            
            pascal.add(row); // add a new row
            
        }
        return pascal;
    }
}
