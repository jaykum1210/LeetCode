class Solution {
    public static String fn(String s){
        int len = s.length();
        if(len==0) return "1";
        StringBuilder str = new StringBuilder();
        for(int i = 0;i<len;i++){
            int count = 1;
            while(i+1<len && s.charAt(i)==s.charAt(i+1)){
                i++;
                count++;
            }
            str.append(count);
            str.append(s.charAt(i));
        }
        return str.toString();
    }
    public String countAndSay(int n) {
        String str = "1";
        while(n>1){
            str = fn(str);
            n--;
        }
        return str;
    }
}