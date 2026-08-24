class Solution {
    public String longestPalindrome(String s) {
        int left = 0;
        int right = 0;
        int totalLength = 0;
        for(int i = 0;i<s.length();i++){
            int low = i;
            int high = i;
            while(low>=0 && high<s.length() && s.charAt(low)==s.charAt(high)){
                if(high-low+1>totalLength){
                    totalLength = high-low+1;
                    left = low;
                    right = high;
                }
                low--;
                high++;
            }
            low = i;
            high = i+1;
            while(low>=0 && high<s.length() && s.charAt(low)==s.charAt(high)){
                if(high-low+1>totalLength){
                    totalLength = high - low+1;
                    left = low;
                    right = high;
                }
                low--;
                high++;
            }
        }
        return s.substring(left,right+1);
    }
}