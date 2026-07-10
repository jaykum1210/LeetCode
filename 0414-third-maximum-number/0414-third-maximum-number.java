class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long sec = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for (int e : nums) {
            if (e == max || e == sec || e == third)
                continue;
            if (e > max) {
                third = sec;
                sec = max;
                max = e;
            } else if (e > sec) {
                third = sec;
                sec = e;
            } else if (e > third) {
                third = e;
            }
        }
        return third == Long.MIN_VALUE ? (int) max : (int) third;
    }
}