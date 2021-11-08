// Joseph Igama
// Solution for problem #1773

import java.util.List;

public class Solution_1773
{
    class Solution {
        public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
            int matches = 0;

            for (int i = 0; i < items.size(); i++)
            {
                if(ruleKey.equals("type") && ruleValue.equals(items.get(i).get(0)))
                {
                    matches++;
                }

                if(ruleKey.equals("color") && ruleValue.equals(items.get(i).get(1)))
                {
                    matches++;
                }

                if(ruleKey.equals("name") && ruleValue.equals(items.get(i).get(2)))
                {
                    matches++;
                }
            }

            return matches;
        }
    }
}
