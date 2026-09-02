class Solution {
    public int reverse(int x) {
        int rev = 0;
        while(x!=0){
            int b = x%10;
            if(rev/10>Integer.MAX_VALUE || rev/10<Integer.MIN_VALUE) return 0;
            rev = rev*10 + b;
            x/=10;
        }   
        return rev;
    }
}