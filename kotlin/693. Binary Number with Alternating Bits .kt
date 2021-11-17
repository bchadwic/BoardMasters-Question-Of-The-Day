class Solution {
    fun hasAlternatingBits(n: Int): Boolean {
        
        var mask = 1 shl 30
        var alt = false; 
        var started = false 
        
        repeat(31){
            with(n and mask){
                if(!started){
                    if(this > 0){
                        started = !started
                    }
                } else {
                    if((this > 0 && !alt) || (this == 0 && alt)){
                        return false
                    }
                    alt = !alt
                }
            
            }
            mask = mask shr 1
        }
        return true
    }
}
