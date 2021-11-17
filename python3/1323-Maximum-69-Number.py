class Solution:
    def maximum69Number (self, num: int) -> int:
        # https://leetcode.com/problems/maximum-69-number
        n_list = list( str(num) )
        n_length = len(n_list)
        compare_num = []

        # special case where num = 99999 , for example all nines
        plus_one = num + 1
        if plus_one == 10**n_length:
            return num

        for i, c in enumerate(n_list):
            wip_list = n_list.copy()

            # switch 9 to 6 OR 6 to 9
            if c == "9":
                new_c = "6"
            if c == "6":
                new_c = "9"

            # swap the character
            wip_list[i] = new_c

            # List to string, string to integer, add to compare_num
            compare_num.append( int( ''.join(wip_list) ) )


        # the original number could be the largest
        compare_num.append(num)

        # largest at the end of the list
        compare_num.sort()

        return compare_num.pop()

