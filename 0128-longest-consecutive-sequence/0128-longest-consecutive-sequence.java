class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int e : nums) {
            set.add(e);
        }

        int max = 0;

        for(int e : set) {
            if(!set.contains(e - 1)) {
                int count = 1;
                int current = e;

                while(set.contains(current + 1)) {
                    count++;
                    current++;
                }

                max = Math.max(max, count);
            }
        }

        return max;
    }
}