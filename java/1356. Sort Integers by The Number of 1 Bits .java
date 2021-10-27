class Solution {
    public int[] sortByBits(int[] arr) {
        BinaryInt[] bArr = new BinaryInt[arr.length];       
        for(int i = 0; i < arr.length; i++){
            bArr[i] = new BinaryInt(arr[i]);
        }
        Arrays.sort(bArr);
        for(int i = 0; i < arr.length; i++){
            arr[i] = bArr[i].getNum();
        }
        return arr;
    }
    
    class BinaryInt implements Comparable<BinaryInt> {
        private int setBits;
        private int num;
        
        public BinaryInt(int num) {
            this.num = num;
            int mask = 1;
            for(int i = 0; i < 32; i++) {
                if((this.num & mask) != 0) {
                    setBits++;
                }
                mask = mask << 1;
            }
        }
        
        public int getNum(){
            return num;
        }
        
        @Override
        public int compareTo(BinaryInt other){
            if(this.setBits < other.setBits){
                return -1;
            } else if(this.setBits > other.setBits){
                return 1;
            } else {
                return this.num < other.num ? -1 : 1;
            }
        }
    }
}


