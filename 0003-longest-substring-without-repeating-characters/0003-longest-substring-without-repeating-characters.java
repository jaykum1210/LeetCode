class Solution {
    public int lengthOfLongestSubstring(String s) {
        int total = 0;
        int max = 0;
        int l = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                total++;
                set.add(s.charAt(i));
            }
            else{
                while(set.contains(s.charAt(i))){
                    set.remove(s.charAt(l));
                    l++;
                    total--;
                }
                set.add(s.charAt(i));
                total++;
            }
            max = Math.max(max,total);
        }
        return max;
    }
}