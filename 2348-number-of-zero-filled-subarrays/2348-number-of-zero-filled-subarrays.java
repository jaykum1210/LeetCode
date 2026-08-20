class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long total = 0;
        for(int e : nums){
            if(e==0){
                count++;
                total+=count;;
            }
            else{
                count=0;
            }
        }
        return total;
    }
}