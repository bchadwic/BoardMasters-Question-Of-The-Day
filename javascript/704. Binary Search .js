/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var search = function(nums, target) {
    return nums.includes(target) ? nums.indexOf(target) : -1
};
