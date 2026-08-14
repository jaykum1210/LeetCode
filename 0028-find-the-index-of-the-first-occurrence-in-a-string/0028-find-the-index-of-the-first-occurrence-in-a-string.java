class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0;i<=haystack.length() - needle.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                int x = 0;
                while(i+x<haystack.length() && x<needle.length() && haystack.charAt(i+x)==needle.charAt(x)) x++;
                if(x==needle.length()) return i;
            }
        }
        return -1;
    }
}