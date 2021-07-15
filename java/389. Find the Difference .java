class Solution {
    public char findTheDifference(String s, String t) {
        
        int total = 0;
        
        for(char c : t.toCharArray())
            total += c;
        
        for(char c : s.toCharArray())
            total -= c;
        
        return (char) total;
    }
}
