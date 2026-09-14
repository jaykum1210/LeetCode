class Solution {
    public static void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int pivot = -1;
        for(int i = nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                pivot = i-1;
                break;
            }
        }
        if(pivot!=-1){
            int min = Integer.MAX_VALUE;
            int minindex = nums.length-1;
            for(int i = nums.length-1;i>pivot;i--){
                if(nums[i] > nums[pivot] && nums[i] < min){
                    min = nums[i];
                    minindex = i;
                }
            }
            int temp = nums[pivot];
            nums[pivot] = nums[minindex];
            nums[minindex] = temp;
        }
        reverse(nums,pivot+1,nums.length-1);
    }
}