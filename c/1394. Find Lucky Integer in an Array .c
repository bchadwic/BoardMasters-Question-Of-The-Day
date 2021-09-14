int findLucky(int* arr, int arrSize){
    unsigned short nums[501] = {0};
    unsigned short i = 0;
    short ans = -1;
    for(; i < arrSize; nums[arr[i++]]++)
        ;
    for(i = 0; ++i < 501; ans = nums[i] == i ? i : ans)
        ;
    return ans;
}
