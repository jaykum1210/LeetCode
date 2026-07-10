class Solution {
    public static int digit(int num){
        int count = 0;
        while(num!=0){
            count++;
            num/=10;
        }
        return count;
    }
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(digit(nums[i])%2==0) count++;
        }
        return count;
    }
}