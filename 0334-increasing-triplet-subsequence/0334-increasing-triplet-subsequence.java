class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int e : nums){
            if(e<=first) first = e;
            else if(e<=second) second = e;
            else return true;
        }
        return false;
    }
}