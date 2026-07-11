class Solution {
    public String toLowerCase(String s) {
        String temp = "";
        for(int i = 0;i<s.length();i++){
            temp+=Character.toLowerCase(s.charAt(i));
        }
        return temp;
    }
}