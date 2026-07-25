class Solution {
    public static int nextMax(int[] nums, int start, int end, int pivot){

    int max = Integer.MAX_VALUE;
    int maxindex = 0;

    for(int i = end; i >= start; i--){

        if(nums[i] > pivot && nums[i] < max){

            max = nums[i];
            maxindex = i;
        }
    }

    return maxindex;
}
    public static void reverse(int[] nums, int pivot, int end){
        while (pivot<end){
            int temp = nums[pivot];
            nums[pivot] = nums[end];
            nums[end] = temp;
            pivot++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int pivot = -1;
        for (int i = nums.length-1;i>0;i--){
            if (nums[i]>nums[i-1]){
                pivot = i-1;
                break;
            }
        }
        if (pivot!=-1){
            int max = nextMax(nums,pivot+1,nums.length-1, nums[pivot]);
            int temp = nums[max];
            nums[max] = nums[pivot];
            nums[pivot] = temp;
        }
        reverse(nums,pivot+1,nums.length-1);
    }
}
