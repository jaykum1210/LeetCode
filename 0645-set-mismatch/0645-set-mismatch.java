class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        int num = 0;
        for(int e : nums){
            if(set.contains(e)){
                num = e;
                continue;
            }
            sum+=e;
            set.add(e);
        }
        int total = (nums.length*(nums.length+1))/2;
        return new int[]{num,total-sum};
    }
}