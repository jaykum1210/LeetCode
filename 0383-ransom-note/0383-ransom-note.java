class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for(char ch :magazine.toLowerCase().toCharArray()){
            arr[ch-'a']++;
        }
        for(char ch : ransomNote.toLowerCase().toCharArray()){
            if(arr[ch-'a']==0) return false;
            arr[ch - 'a']--;
        }
        return true;
    }
}