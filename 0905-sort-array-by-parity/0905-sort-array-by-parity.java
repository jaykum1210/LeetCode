class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int e : nums){
            if(e%2==0) even.add(e);
            else odd.add(e);
        }
        int x = 0;
        for(int i = 0;i<even.size();i++){
            nums[x++] = even.get(i);
        }
        for(int i = 0;i<odd.size();i++){
            nums[x++] = odd.get(i);
        }
        return nums;
    }
}