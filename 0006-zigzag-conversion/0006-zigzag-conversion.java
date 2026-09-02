class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        int totalLength = 2*(numRows-1);
        StringBuilder str = new StringBuilder();
        for(int i = 0;i<numRows;i++){
            for(int j = i;j<s.length();j+=totalLength){
                str.append(s.charAt(j));
                if(i>0 && i<numRows-1){
                    int nextIndex = j + totalLength - 2*i;
                    if(nextIndex<s.length()) str.append(s.charAt(nextIndex));
                }
            }
        }
        return str.toString();
    }
}