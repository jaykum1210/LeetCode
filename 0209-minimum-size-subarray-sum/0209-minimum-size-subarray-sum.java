class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int min = nums.length+1;
        int left = 0;
        for(int i = 0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                min = Math.min(i-left+1,min);
                sum-=nums[left];
                left++;
            }
        }
        return min==nums.length+1?0:min;
    }
}