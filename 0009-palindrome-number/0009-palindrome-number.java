class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int ori = x;
        int rev = 0;
        while(x!=0){
            int b = x%10;
            if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE){
                return false;
            }
            rev = rev*10 + b;
            x/=10;
        }
        return ori==rev;
    }
}