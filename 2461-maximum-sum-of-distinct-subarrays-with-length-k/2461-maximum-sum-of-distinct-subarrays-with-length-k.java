class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        long max = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<k;i++){
            sum+=nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        if(map.size()==k) max = sum;
        int l = 0;
        for(int i = k;i<nums.length;i++){
            sum+=nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

            sum-=nums[l];
            map.put(nums[l],map.get(nums[l])-1);
            if(map.get(nums[l])==0) map.remove(nums[l]);
            l++;
            if(map.size()==k) max = Math.max(max,sum);
        }
        return max;
    }
}