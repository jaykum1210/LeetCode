class Solution {
    public int reverseBits(int n) {
        int Number = 0;
        for(int i = 0;i<32;i++){
            Number = (Number<<1) | (n&1);
            n = n>>1;
        }
        return Number;
    }
}