class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int e : nums) sum+=e;
        int total = ((nums.length*(nums.length+1))/2);
        return total-sum;
    }
}