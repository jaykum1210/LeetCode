class Solution {
    public int myAtoi(String s) {
        s = s.trim();

        if(s.length()==0){
            return 0;
        }

        int index = 0;
        boolean neg = false;

        if(s.charAt(index)=='-'){
            index++;
            neg = true;
        }
        else if(s.charAt(index)=='+'){
            index++;
        }

        long num = 0;

        while(index<s.length() && Character.isDigit(s.charAt(index))){
            num = num*10 + (s.charAt(index)-'0');

            if(neg && -num<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }

            if(!neg && num>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }

            index++;
        }

        return neg ? (int)-num : (int)num;
    }
}