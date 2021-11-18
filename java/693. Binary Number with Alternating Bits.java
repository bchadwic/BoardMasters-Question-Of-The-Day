// Joseph Igama
// Java solution for LeetCode problem number 693

public class Solution
{
    public static boolean hasAlternatingBits(int n)
    {
        String result = Integer.toBinaryString(n);

        for (int i = 0; i < result.length() - 1; i++)
        {
            if(result.charAt(i) == result.charAt(i + 1))
            {
                return false;
            }
        }

        return true;
    }
}
