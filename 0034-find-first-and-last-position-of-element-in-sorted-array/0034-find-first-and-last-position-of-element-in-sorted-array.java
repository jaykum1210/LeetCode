class Solution {
    public static int search(int[] nums, int start, int end,int target, boolean first){
        int left = start;
        int right = end;
        
        int ans = -1;
        
        while(left<=right){
            int mid = left + (right-left)/2;

            if(nums[mid]==target){
                ans = mid;

                if(first){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            else if(nums[mid]<target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int first = search(nums,0,nums.length-1,target,true);
        int last = search(nums,0,nums.length-1,target,false);
        return new int[]{first,last};
    }
}