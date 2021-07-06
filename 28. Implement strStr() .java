class Solution {
    public int strStr(String haystack, String needle) {
 
        if(haystack.equals(needle) || needle.equals(""))
            return 0;
        
        int windowAmount = haystack.length() - needle.length() + 1;
        
        for(int i = 0; i < windowAmount; i++){
            String window = haystack.substring(i, i + needle.length());   
            if(window.equals(needle))
                return i;
        }
        
        return -1;
    }
}
