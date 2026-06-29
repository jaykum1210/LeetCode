class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int e : nums){
            if(e<0) neg.add(e);
            else pos.add(e);
        }
        int x = 0,p=0,n=0;
        for(int i = 0;i<nums.length;i++){
            if(i%2==0) nums[i] = pos.get(p++);
            else nums[i] = neg.get(n++);
        }
        return nums;
    }
}