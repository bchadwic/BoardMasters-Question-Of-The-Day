class Solution {
    public int countPrimes(int n) {
        
        boolean[] nums = new boolean[n]; // array representing all the values from 0 to n - 1
        int primeCount = 0; // number of prime numbers
        
        for(int i = 2; i < nums.length; i++){
            if(!nums[i]){
                primeCount++;
                for(int k = 2; i * k < n; k++){
                    nums[i * k] = true;
                }
            }
        }
        
        return primeCount;
    }
}
