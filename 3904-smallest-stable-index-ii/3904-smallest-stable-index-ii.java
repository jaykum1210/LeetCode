class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] prefixMax = new int[n];
        int[] suffixMax = new int[n];

        prefixMax[0] = nums[0];
        for(int i = 1;i<n;i++){
            prefixMax[i] = Math.max(prefixMax[i-1],nums[i]);
        }
        suffixMax[n-1] = nums[n-1];
        for(int i = n-2;i>=0;i--){
            suffixMax[i] = Math.min(suffixMax[i+1],nums[i]);
        }
        for(int i = 0;i<n;i++){
            if(prefixMax[i]-suffixMax[i]<=k) return i;
        }
        return -1;
    }
}