public class Solution {
    public int hammingWeight(int n) {
        int result = n & 1;
        
        for(int i = 0, mask = 1; i < 32; i++)
            if((n & (mask <<= 1)) >= 1)
                result++;
        
        return n < 0 ? result + 1 : result;
    }
}
