class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0){
            return false;
        }

        StringBuilder str = new StringBuilder();

        for(int i = 0;i<s.length();i++){
            char curr = s.charAt(i);

            if(curr == '(' || curr == '{' || curr == '['){
                str.append(curr);
            }
            else{
                if(str.length() == 0){
                    return false;
                }
                char top = str.charAt(str.length()-1);

                if(
                    (curr == ')' && top == '(') ||
                    (curr == ']' && top == '[') ||
                    (curr == '}' && top == '{')
                ){
                    str.setLength(str.length()-1);
                }
                else{
                    return false;
                }
            }
        }

        return str.length() == 0;
    }
}