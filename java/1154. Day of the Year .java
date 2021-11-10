class Solution {

    /*
        Given a string date representing a Gregorian calendar date
        formatted as YYYY-MM-DD, return the day number of the year.

        Constraints:
            date.length == 10
            date[4] == date[7] == '-', and all other date[i]'s are
            digits date represents a calendar date between Jan 1st,
            1900 and Dec 31, 2019.

        Questions:
            How many days are in each month?:
                Jan=31 Feb=28/29 Mar=31
                Apr=30 May=31 Jun=30
                Jul=31 Aug=31 Sep=30
                Oct=31 Nov=30 Dec=31

            What determines a leap year?:
                year % 4 == 0 && year % 100 != 0 || year % 400 == 0

        Thought process:
        I can store the days of each month in an int[] where i = the
        month number - 1.  month[1] february will either be 28 or 29
        depending on if it is a leap year could then loop over the
        int[] to sum the days until i < month - 1, then add the day
        on top.
        Solution is O(1)
        This could be more concise and memory friendly

    */
    public int dayOfYear(String date)
    {
        //Get the values out of the String
        int y = Integer.parseInt(date.substring(0, 4));
        int m = Integer.parseInt(date.substring(5, 7));
        int d = Integer.parseInt(date.substring(8, 10));

        //Set the value for Feb and initialize the month array
        int leap  = (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) ? 29 : 28;
        int[] months = new int[]{31, leap, 31, 30, 31, 30, 31, 31, 30, 31, 30};

        //Loop over months to sum the days not including the current month
        //add the current month days afterwards
        int i = 0;
        int days = 0;
        while(i < m - 1){
            days += months[i];
            i++;
        }

        return days + d;
    }
}