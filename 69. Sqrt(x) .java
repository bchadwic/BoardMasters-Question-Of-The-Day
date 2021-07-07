class Solution { // memory efficent but a has a horrible runtime
    public int mySqrt(int x) {
        for(int i = 0; true; i++)
            if(i * i == x)
                return i;
            else if(i * i > x)
                return i - 1;
            else if(i * i < 0)
                return 46340;
    }
}
