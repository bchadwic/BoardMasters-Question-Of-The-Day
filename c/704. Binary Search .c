int search(int* nums, int numsSize, int target){
    
    int lo, mid, hi; 
    lo = 0;
    hi = numsSize - 1;
        
    while(lo <= hi){
        mid = lo + (hi - lo) / 2; 
        if(mid < 0){
            return -1;
        }
        if(nums[mid] > target){
            hi = mid - 1;
        } else if (nums[mid] < target){
            lo = mid + 1;
        } else {
            return mid;
        }
    }
    return -1;
}
