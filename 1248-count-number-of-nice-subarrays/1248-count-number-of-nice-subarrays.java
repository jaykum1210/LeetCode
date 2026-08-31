class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return subarray(nums,k) - subarray(nums,k-1);
    }
    public static int subarray(int[] nums, int k){
        int count = 0;
        int left = 0;
        for(int i = 0;i<nums.length;i++){
            k-=nums[i]%2;
            while(k<0){
                k+=nums[left]%2;
                left++;
            }
            count+=i-left+1;
        }
        return count;
    }
}