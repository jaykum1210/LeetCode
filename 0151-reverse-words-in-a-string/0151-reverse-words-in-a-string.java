class Solution {
    public String reverseWords(String s) {
        s = s.trim();

        if(s.length() == 0){
            return "";
        }

        StringBuilder str = new StringBuilder();

        int end = s.length() - 1;
        int i = end;

        while(i >= 0){

            while(i >= 0 && s.charAt(i) == ' '){
                i--;
            }

            end = i;

            while(i >= 0 && s.charAt(i) != ' '){
                i--;
            }

            int index = i + 1;

            while(index <= end){
                str.append(s.charAt(index));
                index++;
            }

            str.append(" ");
        }

        return str.toString().trim();
    }
}