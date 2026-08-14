class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        StringBuilder result = new StringBuilder();
        int countlength = 2*(numRows-1);
        for(int row = 0;row<numRows;row++){
            for(int index = row;index<s.length();index+=countlength){
                result.append(s.charAt(index));
                if(row>0 && row<numRows-1){
                    int NextIndex = index + countlength - 2*row;
                    if(NextIndex<s.length()) result.append(s.charAt(NextIndex));
                }
            }
        }
        return result.toString();
    }
}