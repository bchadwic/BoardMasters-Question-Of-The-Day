class Solution {
    /*
    Approach 2: A max heap is not needed given that if the second highest number isn't equal or greater
    than the highest, the rest of the lower numbers aren't either. Use a data class to hold three
    numbers, two being the first and second max, the last being the index of the first max.
    */
    
    data class MaxValues(var first: Int, var second: Int, var firstIndex: Int){
        fun shiftFirst(replacement: Int, replacementIndex: Int){
            second = first
            first = replacement
            firstIndex = replacementIndex
        }
        
        fun shiftSecond(replacement: Int) { second = replacement }
    }
   
    fun dominantIndex(nums: IntArray): Int {
        if(nums.size == 1) return 0
        
        val n0 = nums[0]
        val n1 = nums[1]
        val mvs = if(n0 > n1) MaxValues(n0, n1, 0) else MaxValues(n1, n0, 1)
    
        for(i in 2..nums.size - 1){
            val num = nums[i]
            with(mvs){
                when {
                    num >= first -> shiftFirst(num, i)
                    num >= second -> shiftSecond(num)
                }
            }
        }
        
        return with(mvs){ if (first >= second * 2) firstIndex else -1 }
    }
}
/*
Approach 1:
class ValueIndex(val value: Int, val index: Int)

fun dominantIndex(nums: IntArray): Int {
    if(nums.size == 1) return 0
    
    val maxheap = PriorityQueue<ValueIndex> { a, b -> b.value - a.value }
    
    for(i in 0..nums.size - 1) {
        maxheap.add(ValueIndex(nums[i] * 2, i))
    }
    
    return with(maxheap.remove()) {
        if(this.value / 2 >= maxheap.peek().value) this.index else -1
    }
}
*/
