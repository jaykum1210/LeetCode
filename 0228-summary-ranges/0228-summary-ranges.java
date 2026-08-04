class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if(nums.length==0) return list;
        int start = 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1) continue;
            else{
                if(start==i-1){
                    list.add(String.valueOf(nums[start]));
                }
                else{
                    list.add(nums[start] + "->" + nums[i-1]);
                }
                start = i;
            }
        }
        if(start==nums.length-1){
            list.add(String.valueOf(nums[start]));
        }
        else{
            list.add(nums[start] + "->" + nums[nums.length-1]);
        }
        return list;
    }
}