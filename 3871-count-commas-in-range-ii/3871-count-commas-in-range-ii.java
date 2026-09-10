class Solution {
    public long countCommas(long n) {
        long ans = 0;
        long num = 1000;
        while(num<=n){
            ans+=n-num+1;
            num*=1000;
        }
        return ans;
    }
}