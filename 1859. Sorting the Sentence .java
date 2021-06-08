class Solution {
    public String sortSentence(String s) {
        
        String[] sentence = s.split(" "); // break sentence up into different words
        String[] sortedSentence = new String[sentence.length];
        for(String word : sentence){
            int position = word.charAt(word.length() - 1) - '0';
            sortedSentence[position - 1] = word.substring(0, word.length() - 1);
        }
        
        StringBuilder ssorted = new StringBuilder();
        // APPROACH 1
        //for(String word : sortedSentence){
        //    if(word == sortedSentence[sortedSentence.length - 1]){
        //        ssorted.append(word);
        //    } else {
        //        ssorted.append(word).append(" ");
        //    }
        //}
        // APPROACH 2
        for(int i = 0; i < sortedSentence.length - 1; i++){
           ssorted.append(sortedSentence[i]).append(" ");
        }
        ssorted.append(sortedSentence[sortedSentence.length - 1]);
        
        return ssorted.toString();
    }
}
