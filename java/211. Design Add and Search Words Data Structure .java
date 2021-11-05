// Solution for problem #211 leetcode
// Joseph Igama

import java.util.ArrayList;

class WordDictionary
{
    private ArrayList<String> word;

    public WordDictionary()
    {
        word = new ArrayList<String>();
    }

    public void addWord(String wordToAdd)
    {
        word.add(wordToAdd);
    }

    public boolean search(String wordToAdd)
    {
        ArrayList<Boolean> letters = new ArrayList<>();


        for (int i = 0; i < word.size(); i++)
        {
            int trueCount = 0;

            for (int j = 0; j < word.get(i).length(); j++)
            {
                if(wordToAdd.charAt(j) == '.' || wordToAdd.charAt(j) == word.get(i).charAt(j))
                {
                    letters.add(true);
                }
                else
                {
                    letters.add(false);
                }
            }

            for (int j = 0; j < letters.size(); j++)
            {
                if(letters.get(j))
                {
                    trueCount++;
                }
            }

            if(trueCount == letters.size())
            {
                break;
            }
        }

        for (int i = 0; i < letters.size(); i++)
        {
            if (!letters.get(i))
            {
                return false;
            }
        }

        return true;
    }
}