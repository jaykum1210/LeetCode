class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int e : nums){
            if(e==1) count++;
            else{
                if(max<count) max = count;
                count = 0;
            }
        }
        max = Math.max(max, count);
        return max;
    }
}