class WordDictionary {

    private Node root;
    
    public WordDictionary() {
        root = new Node(' ');
    }
    
    public void addWord(String word) {
        Node curr = root;
        for(char c : word.toCharArray()){
            if(curr.letters[c] == null){ // we need to make a node
                curr.letters[c] = new Node(c);
            }
            curr = curr.letters[c];
        }
        curr.word = true;
    }
    
    public boolean search(String word) {
        return searchRecursive(word, root);
    }
    
    private boolean searchRecursive(String word, Node curr){
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(curr.letters[c] == null){
                if(c == '.'){
                    for(Node letter : curr.letters){
                        if(letter != null){
                            if(searchRecursive(word.substring(i+1), letter)){
                                return true;
                            }
                        }
                    }
                }
                return false;
            } else {
                curr = curr.letters[c];
            }
        }
        return curr.word;
        
    }
    
    class Node {
        Node[] letters;
        char letter;
        boolean word;
        
        public Node(char letter){
            letters = new Node['~']; 
            this.letter = letter;
        }
        
        public Node[] getLetters(){
            return letters;
        }
        
    }
}
