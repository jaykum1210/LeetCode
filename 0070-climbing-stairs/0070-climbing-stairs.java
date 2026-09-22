class Solution {
    public int climbStairs(int n) {
        if(n==0 || n==1){
            return n;
        }
        int start = 0;
        int sec = 1;
        int sum = start+sec;
        for(int i = 2;i<=n;i++){
            start = sec;
            sec = sum;
            sum = start+sec;
        }
        return sum;
    }
}