class Solution {
    public int lastStoneWeight(int[] stones) {
        
        Queue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int stone : stones)
            heap.add(stone);
            
        
        while(heap.size() > 1){
            int x = heap.poll(); 
            int y = heap.poll();
            
                 if(x > y) heap.add(x - y);
            else if(y > x) heap.add(y - x);
        }
        
        return heap.size() == 0 ? 0 : heap.poll();
    }
}
