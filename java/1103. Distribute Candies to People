public class Solution_1103
{
    public int[] distributeCandies(int candies, int num_people) {
        int[] candiesToPeople = new int[num_people];
        int candyDistribution = 1;

        while (candies > 0)
        {
            for (int i = 0; i < candiesToPeople.length; i++)
            {
                if (candyDistribution > candies)
                {
                    candiesToPeople[i] = candiesToPeople[i] + candies;
                }
                else
                {
                    candiesToPeople[i] = candiesToPeople[i] + candyDistribution;
                }

                candies = candies - candyDistribution;
                candyDistribution++;

                if(candies <= 0)
                {
                    break;
                }
            }
        }

        return candiesToPeople;
    }
}
