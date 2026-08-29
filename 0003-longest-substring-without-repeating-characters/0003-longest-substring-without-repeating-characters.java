class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] arr = new int[128];
        int left = 0;
        int max = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            left = Math.max(left,arr[ch]);
            max = Math.max(max,i-left+1);
            arr[ch] = i+1;
        }
        return max;
    }
}