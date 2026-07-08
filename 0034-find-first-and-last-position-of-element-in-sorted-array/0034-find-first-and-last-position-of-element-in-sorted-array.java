class Solution {
    public static int first(int[] nums,int target){
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        while (low<=high){
            int mid = (low+high)/2;
            if (nums[mid]==target){
                ans = mid;
                high = mid-1;
            } else if (nums[mid] > target) {
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static int last(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        while (low<=high){
            int mid = (low+high)/2;
            if (nums[mid]==target){
                ans = mid;
                low = mid+1;
            } else if (nums[mid] > target) {
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int left = first(nums,target);
        int right = last(nums,target);
        return new int[]{left,right};
    }
}