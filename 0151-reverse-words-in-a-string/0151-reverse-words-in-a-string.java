class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder str = new StringBuilder(s);
        str.reverse();
        int start = 0;
        for(int i = 0;i<=str.length();i++){
            if(i>0 && i<str.length() && str.charAt(i)==' ' && str.charAt(i-1)==' '){
                str.deleteCharAt(i);
                i--;
                continue;
            }
            if(i==str.length() || str.charAt(i)==' '){
                int end = i-1;
                while(start<end){
                    char temp = str.charAt(start);
                    str.setCharAt(start,str.charAt(end));
                    str.setCharAt(end,temp);
                    start++;
                    end--;
                }
                start = i+1;
            }
        }
        return str.toString();
    }
}