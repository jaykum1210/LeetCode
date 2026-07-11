class Solution {
    public int countSegments(String s) {
        if (s.length() == 0) return 0;
        int count = 0;
        if (s.charAt(0) != ' ')
            count++;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && s.charAt(i - 1) == ' ') {
                count++;
            }
        }
        return count;
    }
}