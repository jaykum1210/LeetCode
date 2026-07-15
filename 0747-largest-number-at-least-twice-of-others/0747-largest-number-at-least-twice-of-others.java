class Solution {
    public int dominantIndex(int[] nums) {
        int maxindex = -1;
        int max = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>max){
                sec = max;
                max = nums[i];
                maxindex = i;
            }
            else if(nums[i]>sec && nums[i]<max && nums[i]!=max){
                sec = nums[i];
            }
        }
        return max>=(2*sec)?maxindex:-1;
    }
}