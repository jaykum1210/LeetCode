class Solution {
    public boolean isMonotonic(int[] nums) {
        int decrease = 0;
        int increase = 0;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]) increase++;
            else if(nums[i]<nums[i+1]) decrease++;
        }
        return increase==0 || decrease==0;
    }
}