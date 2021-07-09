class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26)
            return false;
        
        int[] characters = new int[26]; // alphabet
        char[] sentenceArray = sentence.toCharArray();
        
        for(int i = 0; i < sentence.length(); i++)
            characters[sentenceArray[i] - 'a']++;   
        
        for(int letter : characters)
            if(letter == 0)
                return false;
        return true;
    }
}
