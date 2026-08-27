class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count=0,presum=0,rem=0;
        int[] freq= new int[k];
        freq[0]=1;
       
       for(int i=0;i<nums.length;i++){
        presum=presum+nums[i];
        rem=presum%k;

        if(rem<0){
            rem= rem+k;
        }
        count+= freq[rem];
        freq[rem]++;
       }
       return count;
    }
}