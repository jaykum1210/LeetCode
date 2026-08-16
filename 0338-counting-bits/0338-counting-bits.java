class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i = 0;i<=n;i++){
            int sum = 0;
            int x = i;
            while(x!=0){
                sum+=(x%2);
                x/=2;
            }
            arr[i] = sum;
        }
        return arr;
    }
}