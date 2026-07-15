class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count = 1;
        int max = 1;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1])count++;
            else{
                if(count>max) max = count;
                count = 1;
            }
        }
        return count>max?count:max;
    }
}