class Solution {
    public String longestPalindrome(String s) {
        int maxlen = 0;
        String maxstr = String.valueOf(s.charAt(0));
        for (int i = 0;i<s.length()-1;i++){
            int x = 0;
            for (int j = i+1;j<s.length();j++){
                if (s.charAt(i)==s.charAt(j)){
                    String temp = s.substring(i,j+1);
                    String rev = new StringBuilder(temp).reverse().toString();
                    if (temp.equals(rev) && (j-i+1)>maxlen){
                        maxlen = j-i+1;
                        maxstr = temp;
                    }
                }
            }
        }
        return maxstr;
    }
}