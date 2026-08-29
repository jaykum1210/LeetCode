class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int max = 0;
        int freq = 0;
        int[] arr = new int[26];
        for(int i = 0;i<s.length();i++){
            arr[s.charAt(i)-'A']++;
            freq = Math.max(freq,arr[s.charAt(i)-'A']);
            while(i-left+1-freq>k){
                arr[s.charAt(left)-'A']--;
                left++;
            }
            max = Math.max(max,i-left+1);
        }
        return max;
    }
}