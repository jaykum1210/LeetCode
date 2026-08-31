class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int globalMax = nums[0];
        int globalMin = nums[0];
        int currMax = 0;
        int currMin = 0;
        int total = 0;
        for(int e : nums){
            currMax = Math.max(e,currMax+e);
            currMin = Math.min(e,currMin+e);
            total+=e;
            globalMax = Math.max(globalMax,currMax);
            globalMin = Math.min(globalMin,currMin);
        }
        if(globalMax<0) return globalMax;
        return Math.max(globalMax,total-globalMin);
    }
}