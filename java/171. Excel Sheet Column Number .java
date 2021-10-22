public class Solution
{
    public int titleToNumber(String columnTitle)
    {

        if(columnTitle.length() == 0 || columnTitle.length() > 7){
            return 0;
        }

        int sum = 0;

        for(int i=0; i < columnTitle.length(); i++){

            if(!Character.isUpperCase(columnTitle.charAt(i))){      
                return 0;
            }

            int charVal = columnTitle.charAt(i) - 'A' + 1;           
            int exp = columnTitle.length() - i - 1;                
            sum += Math.pow(26, exp) * charVal;                     
        }

        return sum;
    }
}