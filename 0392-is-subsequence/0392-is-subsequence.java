class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();
        int fast = 0;
        int slow = 0;
        while (fast < arrT.length && slow < arrS.length) {
            if (arrT[fast] == arrS[slow]) {
                slow++;
            }
            fast++;
        }
        return slow == arrS.length;
    }
}