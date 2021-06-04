class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        
        if(deck.length < 2)
            return false;
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int card : deck){
            min = Math.min(card, min);
            max = Math.max(card, max);
        }
        
        int[] occurances = new int[max - min + 1];
        
        for(int card : deck)
            occurances[card - min]++;
        
        int lpf = 0; // Lowest Prime Factor
        for(int occurance : occurances){
            lpf = Math.max(lpf, lowestPrimeFactor(occurance));
            if(lpf < 2)
                return false;
        }
        
        for(int occurance : occurances)
            if(occurance % lpf != 0)
                return false;
        
        return true;
    }
    
    private int lowestPrimeFactor(int num){
        if(num < 1)
            return num;
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return i;
            }
        }
        return num;
    }
}
