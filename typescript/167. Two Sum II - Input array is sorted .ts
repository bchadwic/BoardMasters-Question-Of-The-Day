function twoSum(numbers: number[], target: number): number[] {
    let left: number = 0;
    let right: number = numbers.length - 1;

    while(left < right){
        let sum: number = numbers[left] + numbers[right];
        if(sum < target){
            left++;
        } else if(sum > target){
            right--;
        } else {
            return [left + 1, right + 1];
        }
    }

    return [];
};
