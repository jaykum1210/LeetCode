class Solution {
    public static boolean vowel(char a){
        if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u') return true;
        return false;
    }
    public int maxVowels(String s, int k) {
        int count = 0;
        for(int i = 0;i<k;i++){
            if(vowel(s.charAt(i))) count++;
        }
        int max = count;
        int l = 0;
        for(int i = k;i<s.length();i++){
            if(vowel(s.charAt(i))) count++;
            if(vowel(s.charAt(l))) count--;
            if(count>max) max = count;
            l++;
        }
        return max;
    }
}