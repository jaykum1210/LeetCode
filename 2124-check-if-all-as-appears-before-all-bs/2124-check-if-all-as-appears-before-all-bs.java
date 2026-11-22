class Solution {
    public boolean checkString(String s) {
        boolean a = false;
        boolean b = false;

        for(int i = 0;i<s.length();i++){
            if(b == true && s.charAt(i)=='a'){
                return false;
            }
            if(s.charAt(i)=='a'){
                a = true;
            }
            if(s.charAt(i)=='b'){
                b = true;
            }
        }

        return true;
    }
}