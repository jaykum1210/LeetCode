class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        int x = 0, y = 0;
        while(x<word1.length() && y<word2.length()){
            str.append(word1.charAt(x++));
            str.append(word2.charAt(y++));
        }
        while(x<word1.length()) str.append(word1.charAt(x++));
        while(y<word2.length()) str.append(word2.charAt(y++));
        return str.toString();
    }
}