class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char arr[] = new char[26];
        for(int i = 0;i<s.length();i++){
            char a = s.charAt(i);
            arr[a-'a']++;
        }
        for(int i = 0;i<t.length();i++){
            char b = t.charAt(i);
            arr[b-'a']--;
        }
        for(int e : arr) if(e!=0) return false;
        return true;
    }
}