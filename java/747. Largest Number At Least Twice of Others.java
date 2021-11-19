// Joseph Igama
// Solution for problem #747

public class Solution
{
    public static int dominantIndex(int[] nums)
    {
        int biggestNum = 0;
        int biggestNumIndex = -1;

        for (int i = 0; i < nums.length; i++)
        {
            if(nums[i] > biggestNum)
            {
                biggestNum = nums[i];
                biggestNumIndex = i;
            }
        }

        for (int i = 0; i < nums.length; i++)
        {
            if(nums[i] > (biggestNum / 2) && i != biggestNumIndex)
            {
                biggestNumIndex = -1;
                break;
            }
        }

        return biggestNumIndex;
    }
}
