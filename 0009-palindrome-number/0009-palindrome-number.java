class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int ori = x;
        int rev = 0;
        while(x!=0){
            if(rev<Integer.MIN_VALUE/10 || rev>Integer.MAX_VALUE/10) return false;
            rev = rev*10 + (x%10);
            x/=10;
        }
        return ori==rev;
    }
}