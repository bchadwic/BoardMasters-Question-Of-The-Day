class Solution {
    fun maximum69Number (f_num: Int): Int {
        /*
        initial thoughts: find the left most `6` and change it to a `9`
        change it by adding a 3 or 3*10*x? depending on where the value we are changing is
        
        
        revised approach: add all the numbers to a stack, then pop them off into a num and change the left
        most 6 to a 9
        
        helpful resource
        https://stackoverflow.com/questions/3389264/how-to-get-the-separate-digits-of-an-int-number
        */
        
        // get the length of a number using this formula (0-indexed)
        val size = kotlin.math.log10(f_num.toDouble()).toInt()
        val stack = Stack<Int>()
        // create a non final copy
        var num = f_num
        
        for(i in 0..size){
            stack.push(num % 10)
            num /= 10
        }
        
        var changed = false
        while(!stack.isEmpty()){
            num *= 10   
            with(stack.pop()){
                num += if(!changed && this == 6){
                    changed = !changed
                    9
                } else this
            }
        }
        
        return num
    }
}
