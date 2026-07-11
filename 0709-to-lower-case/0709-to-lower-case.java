class Solution {
    public String toLowerCase(String s) {
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            temp.append(Character.toLowerCase(s.charAt(i)));
        }

        return temp.toString();
    }
}