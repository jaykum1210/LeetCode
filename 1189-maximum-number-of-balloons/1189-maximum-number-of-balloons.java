class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] arr = new int[26];
        for(int i = 0;i<text.length();i++) arr[text.charAt(i)-'a']++;
        int min = text.length();
        if(arr[0]<min) min = arr[0];
        if(arr[1]<min) min = arr[1];
        if(arr[11]/ 2<min) min = arr[11]/2;
        if(arr[14]/ 2<min) min = arr[14]/2;
        if(arr[13]<min) min = arr[13];
        return min;
    }
}