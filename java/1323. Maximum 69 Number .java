//

public class Solution
{
    public static int maximum69Number (int num)
    {
        StringBuilder numString = new StringBuilder(Integer.toString(num));

        for (int i = 0; i < numString.length(); i++)
        {
            if (numString.charAt(i) != '9')
            {
                numString.setCharAt(i, '9');

                if (Integer.parseInt(String.valueOf(numString)) > num)
                {
                    return Integer.parseInt(String.valueOf(numString));
                }
            }
        }

        return num;
    }

    public static void main(String[] args)
    {
        System.out.println(maximum69Number(9669));
    }
}
