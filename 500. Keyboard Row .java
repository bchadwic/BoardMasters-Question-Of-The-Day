class KeyBoard {
    
    List<Set<Character>> rows;
    
    public KeyBoard(){
        rows = new ArrayList<>();
        
        rows.add(Set.of(     'q','w','e','r','t','y','u','i','o','p'    ));
        rows.add(Set.of(       'a','s','d','f','g','h','j','k','l'      )); // keyboard replica
        rows.add(Set.of(          'z','x','c','v','b','n','m'           ));
    }
    
    public boolean wordCanBeTypedOnOneRow(String word){
        for(Set<Character> row : rows)
            for(int i = 0; i <= word.length(); i++)
                if(i == word.length())
                    return true;
                else if(!row.contains(word.charAt(i))) 
                    break;
        
        return false;
    }
}

class Solution {
    public String[] findWords(String[] words) {
        
        KeyBoard kb = new KeyBoard();
        
        List<String> foundWords = new ArrayList<>();
        
        for(String word : words)
            if(kb.wordCanBeTypedOnOneRow(word.toLowerCase()))
                foundWords.add(word);
        
        return foundWords.toArray(new String[foundWords.size()]);
        
        
    }
}
